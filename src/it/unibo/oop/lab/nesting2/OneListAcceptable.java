package it.unibo.oop.lab.nesting2;

import java.util.*;

public class OneListAcceptable<T> implements Acceptable<T>{
	private List<T> accetableList;
	
	public OneListAcceptable(final List<T> list) {
		this.accetableList = list;
	}
	
    public Acceptor<T> acceptor() {
        final Iterator<T> iterator = accetableList.iterator();
        return new Acceptor<T>() {

            /**
             * @param newElement
             *            the new element to be accepted
             */
            @Override
            public void accept(final T newElement) throws ElementNotAcceptedException {
                try {
                    if (newElement.equals(iterator.next())) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("no more element to be evaluated");
                }
                throw new Acceptor.ElementNotAcceptedException(newElement);
            }

            @Override
            public void end() throws EndNotAcceptedException {
                try {
                    if (!iterator.hasNext()) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("2" + e.getMessage());
                }
                throw new Acceptor.EndNotAcceptedException();
            }
        };
    }
}

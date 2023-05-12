package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int size() {
		int size = 0;
		SingleLinkedListNode<T> aux = head;
		while(aux.isNIL()) {
			size ++;
			aux = aux.getNext();
		}
		return size;
	}

	@Override
	public T search(T element) {
		T search = null;
		if(isEmpty()) {
			search = null;
		}
		else {
			SingleLinkedListNode<T> aux = head;
			while(aux.isNIL()) {
				if(aux.getData().equals(element)) {
					search = aux.getData();
				}
				aux = aux.getNext();
			}
		}
		return search;
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> aux = head;
		while(!aux.isNIL()) {
			aux = aux.getNext();
		}
		aux.setData(element);
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}

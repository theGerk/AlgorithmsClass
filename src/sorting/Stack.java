/**
 * 
 */
package sorting;

/**
 * @author benjialtman
 *
 */
public class Stack<T> {
	private LinkedListNode<T> top;
	
	public T pop() {
		if(top == null)
			return null;
		
		T hold = top.data;
		top = top.next;
		return hold;
	}
	
	public void push(T insert) {
		top = new LinkedListNode<T>(insert, top);
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public Stack(T initilizer) {
		top = new LinkedListNode<T>(initilizer);
	}
}

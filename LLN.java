package generics;

public class LLN <T>{
	private T value;
	private LLN<T> next = null;
	
	public LLN(T object){
		value = object;		
	}
	
	public void setNext(LLN<T> node) {
		next = node;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	public boolean hasNext() {
		if (next == null) {
			return false;
		}
		return true;
	}
	
	public LLN<T> getNext() {
		return next;
	}
	

}

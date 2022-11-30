package question;

public class Container <K, M> {
	public K content1;
	public M content2;
	
	public K getKey() {
		return content1;
	}
	
	public M getValue() {
		return content2;
	}
	
	public void set(K k, M m) {
		this.content1 = k;
		this.content2 = m;
	}
}

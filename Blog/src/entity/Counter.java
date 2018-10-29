package entity;

public class Counter {
	
	private long num;

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Counter [num=" + num + "]";
	}

}

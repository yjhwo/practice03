package prob7;

public abstract class Bird {
	private String name;
	private int legs;
	private int length;
	
	public Bird(){ }

	public Bird(String name, int legs, int length) {
		super();
		this.name = name;
		this.legs = legs;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void fly();
	
	public abstract void sing();
	
	public abstract String toString();
}

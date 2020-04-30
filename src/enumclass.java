
public enum enumclass {
CAT ("Tom"),DOG ("Bob"),MOUSE ("Jerry");
	String name;
	enumclass(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "This animal is " + name;
	}
}

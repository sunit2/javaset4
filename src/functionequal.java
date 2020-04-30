
class equalclass {
	int id;
	String name;

	equalclass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equalclass other = (equalclass) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class functionequal {

	public static void main(String[] args) {
		equalclass equal1 = new equalclass(10, "Attra");
		equalclass equal2 = new equalclass(10, "Attra");
		System.out.println(equal1.equals(equal2));

		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		
		double c = 2.6;
		double d = 2.6;
		System.out.println(c == d);
	
		String e = "Ram";
		String f = "Ram";
		System.out.println(e.equals(f));

	}

}

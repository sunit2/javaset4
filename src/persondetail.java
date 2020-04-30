import java.io.Serializable;

public class persondetail implements Serializable {
	int id;
	transient int serialnumber;
	String name;
	persondetail (int id, int serialnumber, String name) {
		this.id = id;
		this.serialnumber = serialnumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [id= "+ id + ",serial number " + serialnumber + ",name=" + name + "]";
	}
}

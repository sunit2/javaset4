import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readobject {

	public static void main(String[] args) {
		System.out.println("Reading file..");
		try {
			FileInputStream fi = new FileInputStream ("peopel.bin");
			ObjectInputStream oi = new ObjectInputStream (fi);
			persondetail person3 = (persondetail)oi.readObject();
			persondetail person4 = (persondetail)oi.readObject();
			System.out.println(person3);
			System.out.println(person4);
			oi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

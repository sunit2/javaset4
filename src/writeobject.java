import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeobject {

	public static void main(String[] args) {
		System.out.println("Writing object");
		persondetail person1 = new persondetail (1234,111, "Mike");
		persondetail person2 = new persondetail (4567,222, "Sue");
		try(FileOutputStream fs = new FileOutputStream ("peopel.bin")) {
			ObjectOutputStream os = new ObjectOutputStream (fs);
			os.writeObject(person1);
			os.writeObject(person2);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}

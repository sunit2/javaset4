import java.util.ArrayList;

public class arrayclass {

	public static void main(String[] args) {
		ArrayList<Integer> number= new ArrayList <Integer> ();
		number.add(10);
		number.add(20);
		number.add(100);
		System.out.println(number.get(0));
		
		System.out.println("1st iteration");
		for (int i = 0; i< number.size();i++) {
			System.out.println(number.get(i));
		}
		
		number.add(70);
		number.add(170);
		System.out.println("2nd iteration");
		for (int i:number) {
			System.out.println(i);
		}
		
		number.remove(number.size()-1);
		number.remove(0);
		System.out.println("3rd iteration");
		for (int i:number) {
			System.out.println(i);
		}
		
	}

}

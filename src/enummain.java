
public class enummain {

	public static void main(String[] args) {
		enumclass animal = enumclass.DOG;
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		}
		System.out.println(enumclass.DOG);
		System.out.println(animal.DOG.getClass());
		System.out.println(animal.MOUSE.getName());
	}

}

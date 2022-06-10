public class Person {
 public static Gender { MAN, WOMAN };	
private Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public void speak() {
		switch (gender) {
			
			case 1:
				System.out.println("I'm a man");
break;
		    case 2:
				System.out.println("I'm a woman");
break;
default:
}
	}

	public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		man.speak();

		Person woman = new Person(Gender.WOMAN);
		woman.speak();
	}
}









public class TryCatchFinallySample {

	public static void main(String[] args) {
		①try {
			System.out.println("①try");
			Integer.parseInt(args[0]);
		} ②catch (Exception e) {
			System.out.println("②catch");
		} ③finally {
			System.out.println("③finally");
		}
	}
}

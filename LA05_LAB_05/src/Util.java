import java.util.Scanner;

public class Util {
	
	static Scanner scan = new Scanner(System.in);
	
	public Util() {
		
	}
	
	public static void CLS() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
	
	public static void PressEnter() {
		System.out.println("Press Enter to continue...");
		scan.nextLine();
	}
	
}

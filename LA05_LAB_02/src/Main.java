import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
//		Wrapper Class and Method
		
//		Java memiliki 2 jenis tipe data
		
//		Tipe data primitif
//		int, double, float, boolean, char
//		hanya berfungsi untuk menyimpan sebuah value
//		ditulis singkat dan huruf kecil semua
		
//		Wrapper Class
//		Sebuah class yang membungkus tipe data primitif dengan
//		berbagai macam fungsi
//		Integer, Float, Double, Character, Boolean
//		Kita bisa menggunakan fungsi-fungsi yang disediakan
//		wrapper class
//		penulisannya lengkap dan huruf pertamanya kapital
		
		int a = 100;
		
		Integer b = 12;
		
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
		
		System.out.println(b.compareTo(100));
		
		System.out.println("Max: " + Integer.max(a, b));
		
//		Character
		char c = 'o';
		
		Character d = 'p';
		
		System.out.println(Character.toUpperCase(d));
		
		System.out.println("d is an alphabet: " + Character.isAlphabetic(d));
		
//		String Class and Method
//		String bukan sebuah wrapper class
//		menyimpan series of character
		
		String str = "Alex@yahoo.com";
		System.out.println("Str: " + str.toUpperCase());
		
		if(str.endsWith("@yahoo.com")) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is invalid");
		}
			
		System.out.println(str.contains("le"));
		
//		Build in class and method in Java (Math, Date, etc)
		
//		Math
//		Class yang menyediakan fungsi untuk melakukan perhitungan matematika
		
		System.out.println("Pi: " + Math.PI);
		System.out.println("Pi salah: " + (float)22/7);
		
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.round(5.4));
		
//		Type Casting Variable
//		Mengubah tipe data dari suatu variable
//		tambahkan tipe data di dalam kurung pada awal nilai
		
		System.out.println("Pi salah: " + (double)22/7);
		
//		Java mengenali semua data bilangan desimal adalah double
		float fl = (float)5.3;
		
		int num = (int)fl;
		
		// cara ini memaksa tipe data untuk berubah
		
		int num2 = 1000;
		
		String snum = Integer.toString(num2);
		
		System.out.println(snum);
	
//		string to int = Integer.parseInt()
		
//		Exception Handling
//		cara kita untuk menghandle error
//		menggunakan try catch
		
		Scanner scan = new Scanner(System.in);
		int inp;
		
//		System.out.println("Input a number: ");
		
//		try {
//			inp = scan.nextInt();
//		} catch (ArithmeticException e) {
//			inp = -1;
//			System.out.println("Please input a number");
//		} catch (InputMismatchException e) {
//			inp = 0;
//			System.out.println("salah");
//		}
		
//		System.out.println("inp = " + inp);
		
		LocalDateTime date = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMM dd");
		
		String formattedDate = date.format(formatter);
		
		System.out.println(formattedDate);
		
//		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

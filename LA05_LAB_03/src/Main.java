import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		System.out.println("hello");
//		           0  1  2  3  4  5
		int[] a = {1, 2, 3, 4, 5, 6};
		
//		System.out.println("value: " + a[2]);
		
//		for (int i : a) {
//			System.out.println(i);
//		}
		
//		System.out.println("before");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		ctrl + alt + arrow key(up/down)
		a[2] = 10;
		a[1] = 9;
		a[4] = 23;
		
//		System.out.println("\n\nafter");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		data type yang dapat diterima vector hanya class, wrapper class
		Vector<Integer> vec = new Vector<>();
		vec.add(10);
		vec.add(23);
		vec.add(14);
		vec.add(53);
		
//		System.out.println("value: " + vec.elementAt(0));
//		System.out.println("before");
//		for (Integer i : vec) {
//			System.out.println("value: " + i);
//		}
	
//		System.out.println("before");
//		System.out.println("empty: " + vec.isEmpty());
		
//		vec.clear();
		
//		System.out.println("\n\nafter");
//		System.out.println("empty: " + vec.isEmpty());a
		
//		vec.remove(1);
		vec.set(3, 30);
//		System.out.println("\n\nafter");
//		for (Integer i : vec) {
//			System.out.println("value: " + i);
//		}
		
//		System.out.println("size: " + vec.size());
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("dog");
		list.add("cat");
		list.add("pig");
		list.add("monkey");
		
//		System.out.println("value: " + list.get(1));
		
//		System.out.println("before");
//		for (String s : list) {
//			System.out.println(s);
//		}
		
//		list.remove(1);
//		System.out.println("\n\nafter");
//		for (String s : list) {
//			System.out.println(s);
//		}
		
//		System.out.println("value: " + list.contains("cat"));
		
//		list.set(0, "bird");
//		System.out.println("\n\nafter");
//		for (String s : list) {
//			System.out.println(s);
//		}
		
//		System.out.println("empty: " + list.isEmpty());
//		
//		list.clear();
//		
//		System.out.println("\n\nafter");
//		System.out.println("empty: " + list.isEmpty());
		
		System.out.println("size: " + list.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

import Model.Pet;

public class Main {

	public Main() {
//		Object Oriented Programming Concept
//		OOP Concept
//		Encapsulation
//		Inheritance
//		Polymorphism
//		Abstraction
		
		
		
//		Class and Object
//		Class -> Blueprint dari Objek
		
//		User{
//			email,
//			password,
//			username
//		}
		
//		Object -> Bentuk nyata dari class
		
//		User{
//			email = "alexander.wijaya004@binus.ac.id",
//			password = "asdasd" 
//			username = "alx"
//		}
		
//		Package
//		Directory Management
//		Nyimpen class biar rapi
		
//		Shortcut
//		ALT + SHIFT + N -> p
		
		
		Pet pet1 = new Pet("Skippy", 4, "Dog");
				
		pet1.setName("Mokka");
		pet1.setAge(-10);
		
		System.out.println("Name: " + pet1.getName());
		System.out.println("Age: " + pet1.getAge());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

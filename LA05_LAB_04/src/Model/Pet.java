package Model;

public class Pet {
	
//	Encapsulation
//	Membungkus sebuah class menjadi satu kesatuan
//	Membuat class kita menjadi lebih secure
	
//	Access Modifier
//	keyword akses yang dimiliki oleh sebuah variable atau method
//	public -> bisa diakses di mana saja (global/worldwide)
//	protected -> bisa diakses di package yang sama & child class
//	default -> hanya bisa diakses di package yanng sama
//	private -> hanya bisa diakses di class nya sendiri
	

	// Attribute
	private String name;
	private int age;
	private String type;
	
	// Method/Function
	
	// Constructor -> harus dimiliki oleh semua class
	// Untuk membuat sebuah objek dari class yang bersangkutan
	
	// Shortcut Constructor
	// ALT + SHIFT + S -> O
	
	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
// Accessor and Mutator
	
	// Setter (Mutator)
	// Mengubah/Modify atribut kita
	
	// Getter (Accessor)
	// Return/mengambil value dari atribut kita
	
	// Shortcut Setter & Getter
	// ALT + SHIFT + S -> R
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1){
			System.out.println("Please input a valid age");
		} else {
			this.age = age;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

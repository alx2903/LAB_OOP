import java.util.Vector;

public class Student {
	private String name;
	private Vector<Subject> SubVector;
	final private StudentID ID;
	
	public Student(String name, Vector<Subject> subVector, StudentID iD) {
		super();
		this.name = name;
		this.SubVector = subVector;
		this.ID = iD;
	}

	public StudentID getID() {
		return ID;
	}

	public Vector<Subject> getSubVector() {
		return SubVector;
	}

	public void setSubVector(Vector<Subject> subVector) {
		SubVector = subVector;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

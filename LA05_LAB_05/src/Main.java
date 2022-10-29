import java.util.Vector;

public class Main {

	public Main() {
//		association = composition
//		            = aggregation
		
		// TODO Auto-generated constructor stub
//		System.out.println("Helo");
//		School school = new School("School A");
		
//		Util utility = new Util();
		Vector<Subject> VecSubject = new Vector<>();
		VecSubject.add(new Subject("Math"));
		VecSubject.add(new Subject("PE"));
		
		StudentID id = new StudentID("2540131374");
		
		Student stud = new Student("Student A", VecSubject, id);
		
		System.out.println("The id of Student A: " + stud.getID().getStringID());
		Util.PressEnter();
		Util.CLS();
		System.out.println("Hello");
		
//		for (Subject subject : stud.getSubVector()) {
//			System.out.println("Subject: " + subject.getName());
//		}
		
//		System.out.println(stud.getName() + " studying at " + school.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

package visitor;

public class VisitorMain {
	
	//The Visitor Design Pattern is a behavioral design pattern that lets you add new operations to a group of related objects without changing their classes.
	//Instead of putting every operation inside the objects themselves, you create a separate Visitor class that "visits" each object and performs the operation.
	//Example: Doctor visits patients. Doctor is visitor.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildPatient child=new ChildPatient();
		AdultPatient adult=new AdultPatient();
		
		Doctor doctor=new GeneralDoctor();
		
		child.accept(doctor);
		adult.accept(doctor);
	}

}

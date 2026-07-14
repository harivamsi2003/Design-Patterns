package visitor;

public class GeneralDoctor implements Doctor {

	@Override
	public void visit(ChildPatient childpatient) {
		// TODO Auto-generated method stub
		System.out.println("Treating child patient.");
	}

	@Override
	public void visit(AdultPatient adultpatient) {
		// TODO Auto-generated method stub
		System.out.println("Treating adult patient.");
	}

}

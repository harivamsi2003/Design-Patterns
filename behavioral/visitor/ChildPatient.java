package visitor;

public class ChildPatient implements Patient {

	@Override
	public void accept(Doctor doctor) {
		// TODO Auto-generated method stub
		doctor.visit(this);
	}

}

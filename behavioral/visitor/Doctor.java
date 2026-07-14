package visitor;

public interface Doctor {
	void visit(ChildPatient childpatient);
	void visit(AdultPatient adultpatient);
}

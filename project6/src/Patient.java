public class Patient extends Person{
    protected String id;
    protected int age;
    protected String accepted;
    protected String sickness;
    protected String prescriptions;
    protected String allergies;
    protected String specialReqs;
    protected OperationsStaff[] OS;

    public Patient(String title, String givenName, String middleName, String familyName, String name, String birthDate, String gender, String homeAddress, String phone, Hospital hospital, String id, int age, String accepted, String sickness, String prescriptions, String allergies, String specialReqs, OperationsStaff[] OS) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, hospital);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
        this.OS = OS;
    }
}

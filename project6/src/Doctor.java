public class Doctor extends OperationsStaff{
    private String speciality;
    private String locations;

    public Doctor(String title, String givenName, String middleName, String familyName, String name, String birthDate, String gender, String homeAddress, String phone, Hospital hospital, String id, int age, String accepted, String sickness, String prescriptions, String allergies, String specialReqs, OperationsStaff[] OS, Patient[] patients, String speciality, String locations) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, hospital, id, age, accepted, sickness, prescriptions, allergies, specialReqs, OS, patients);
        this.speciality = speciality;
        this.locations = locations;
    }
}

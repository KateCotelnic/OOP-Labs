public class OperationsStaff extends Patient{
    Patient[] Patients;

    public OperationsStaff(String title, String givenName, String middleName, String familyName, String name, String birthDate, String gender, String homeAddress, String phone, Hospital hospital, String id, int age, String accepted, String sickness, String prescriptions, String allergies, String specialReqs, OperationsStaff[] OS, Patient[] patients) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, hospital, id, age, accepted, sickness, prescriptions, allergies, specialReqs, OS);
        Patients = patients;
    }
}

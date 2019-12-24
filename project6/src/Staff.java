public class Staff extends Person {
    protected String joined;
    protected String education;
    protected String certification;
    protected String languages;
    Department department;

    public Staff(String title, String givenName, String middleName, String familyName, String name, String birthDate, String gender, String homeAddress, String phone, Hospital hospital, String joined, String education, String certification, String languages, Department department) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, hospital);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
        this.department = department;
    }
}

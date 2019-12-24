public class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected String name;
    protected String birthDate;
    protected String gender;
    protected String homeAddress;
    protected String phone;
    Hospital hospital ;

    public Person(String title, String givenName, String middleName, String familyName, String name, String birthDate, String gender, String homeAddress, String phone, Hospital hospital) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.hospital = hospital;
    }
}

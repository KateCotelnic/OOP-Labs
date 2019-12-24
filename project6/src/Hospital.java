public class Hospital {
    protected String name;
    protected String address;
    protected String phone;
    protected Person[] Persons;

    public Hospital(String name, String address, String phone, Person[] persons) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        Persons = persons;
    }
}

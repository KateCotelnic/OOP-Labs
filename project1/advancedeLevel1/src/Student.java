public class Student {

    private String nameStudent;
    private int ageStudent;
    public double markStudent;

    public Student(String nameStudent, int ageStudent, double markStudent) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.markStudent = markStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public double getMarkStudent() {
        return markStudent;
    }
}

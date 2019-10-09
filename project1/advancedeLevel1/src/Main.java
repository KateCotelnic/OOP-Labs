
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Kate", 20, 10);
        Student st2 = new Student("Viorel", 30, 9.75);
        Student st3 = new Student("Alex", 17, 9);
        Student st4 = new Student("Ion", 20, 7.5);
        Student st5 = new Student("Vasile", 20, 9.12);
        Student st6 = new Student("Marcel", 20, 8.7);
        Student st7 = new Student("Stefan", 19, 7.65);
        Student st8 = new Student("Tudor", 19, 9.02);
        Student st9 = new Student("Viorel", 22, 7);

        University uni1 = new University();
       uni1.name = "UTM";
       uni1.foundationYear = 1930;
       uni1.Stud.add(st1);
       uni1.Stud.add(st2);
       uni1.Stud.add(st3);

        University uni2 = new University();
        uni2.name ="ASEM";
        uni2.foundationYear = 1990;
        uni2.Stud.add(st4);
        uni2.Stud.add(st5);
        uni2.Stud.add(st6);

        University uni3 = new University();
        uni3.name = "USM";
        uni3.foundationYear = 1900;
        uni3.Stud.add(st7);
        uni3.Stud.add(st8);
        uni3.Stud.add(st9);

        double averageUni1 = AverageMark.averageMark(st1.markStudent, st2.markStudent, st3.markStudent);
        double averageUni2 = AverageMark.averageMark(st4.markStudent, st5.markStudent, st6.markStudent);
        double averageUni3 = AverageMark.averageMark(st7.markStudent, st8.markStudent, st9.markStudent);

        System.out.println("The average media of " + uni1.name + " is " + String.format("%.2f", averageUni1));
        System.out.println("The average media of " + uni2.name + " is " + String.format("%.2f", averageUni2));
        System.out.println("The average media of " + uni3.name + " is " + String.format("%.2f",averageUni3));
    }
}

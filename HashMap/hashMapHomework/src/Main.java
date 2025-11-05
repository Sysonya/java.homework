//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    GradeBook gradebook = new GradeBook();
    Student stud1 = new Student("1001","Misha");
    stud1.addGrade(90);
    stud1.addGrade(85);
    stud1.addGrade(100);
    Student stud2 = new Student("1002", "Ira");
    stud2.addGrade(100);
    stud2.addGrade(80);
    stud2.addGrade(100);
    Student stud3 = new Student("1003", "Zoia");
    stud3.addGrade(100);
    stud3.addGrade(100);
    stud3.addGrade(100);

    gradebook.addStudent(stud1);
    gradebook.addStudent(stud2);
    gradebook.addStudent(stud3);

    System.out.println("GradeBook:");
    gradebook.printStudents();

    gradebook.findStudent("1003");
    gradebook.findStudent("1010");
    gradebook.findStudent("1002");

    gradebook.removeStudent("1001");
    System.out.println("GradeBook:");
    gradebook.printStudents();
    }
}
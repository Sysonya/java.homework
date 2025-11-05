import java.util.HashMap;

public class GradeBook {
    private HashMap<String, Student> students;

    public GradeBook(){
        students = new HashMap<>();
    }

    public void addStudent(Student student){
        students.put(student.getID(), student);
    }
    public void removeStudent(String ID){
        students.remove(ID);
    }

    public void findStudent(String ID){
        students.get(ID);
    }
    public void printStudents(){

        for (Student s : students.values()){
            System.out.println(s);
        }
    }
}

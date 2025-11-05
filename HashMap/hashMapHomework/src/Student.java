import java.util.ArrayList;

public class Student {
    private String ID;
    private String Name;
    private ArrayList<Integer> grades;

    public Student(String ID, String Name){
        this.ID = ID;
        this.Name = Name;
        this.grades = new ArrayList<>();
    }
    public String getID(){
        return ID;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    @Override
    public String toString() {
        return "ID: " + ID + "; Name: " + Name + "; Grades: " + grades;
    }
}

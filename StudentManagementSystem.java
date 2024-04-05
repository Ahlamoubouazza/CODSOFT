import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    //attributs
    private List<student> students;
    /*  ce constructeur crée une nouvelle instance de la classe StudentManagementSystem et
     initialise une variable students en tant qu'ArrayList vide*/
    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(student Student) {
        students.add(Student);
    }

    public void removeStudent(int rollNumber) {
        for (student i : students) {
            if (i.getRollNumber() == rollNumber) {
                students.remove(i);
                break;
            }
        }
    }

    public student findStudent(int rollNumber) {
        for (student i : students) {
            if (i.getRollNumber() == rollNumber) {
                return i;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (student i : students) {
            System.out.println(i);
        }
    }
}
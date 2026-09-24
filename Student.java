/* T. Urness
 * CS 67
 * Introduction to Inheritance
 * Student class inherits from Person
 * adds a gpa field and a study method
 */ 

 public class Student extends Person implements Studyable {
    private double gpa;

    public Student(String n, int a, double g) {
        super(n,a);
        gpa = g;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public double getGPA() {
        return gpa;
    }

    
    @Override
    public void study() {
        gpa += 0.1;
    }


    public void study(int hours) {
        gpa += hours * 0.05;
    }


    @Override
public String toString() {
    String returnString = "";
    returnString += "STUDENT\n";
    returnString += "  name: " + getName() + "\n";
    returnString += "  age: " + getAge() + "\n";
    returnString += "  gpa: " + gpa + "\n";
    return returnString;
    }

}



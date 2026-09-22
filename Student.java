/* T. Urness
 * CS 67
 * Introduction to Inheritance
 * Student class inherits from Person
 * adds a gpa field and a study method
 */ 

 public class Student extends Person {
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

    public void study() {
        gpa += 0.1;
    }

    public String toString() {
        String returnString = "";
        returnString += "STUDENT\n";
        returnString += "  name: " + name + "\n";
        returnString += "  age: " + age + "\n";
        returnString += "  gpa: " + gpa + "\n";
        return returnString;
    }

}



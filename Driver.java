public class Driver {
    
    public static void main(String[] args) {
        Person p1 = new Person("Alexa", 12);
        System.out.println(p1);

        Student s1 = new Student("Gus", 23, 2.3);
        System.out.println(s1);

        // Implementing the study method
        s1.study();
        System.out.println("After studying: ");
        System.out.println(s1);

        // Overload study method
        s1.study(3);
        System.out.print("After studying for 3 hours: ");
        System.out.println(s1);
    
    }
}

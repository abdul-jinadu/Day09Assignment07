public class ProtectedDriver {
    
    public static void main(String[] args) {
        ProtectedPerson p1 = new ProtectedPerson("Alexa", 12);
        System.out.println(p1);

        ProtectedStudent s1 = new ProtectedStudent("Gus", 23, 2.3);
        System.out.println(s1);
    }

}

public class Signature {

    public static void myMethod(int y, String name) {
        for (int i = 0; i< y; i++) {
            System.out.println(name);
        }
    }
    
    public static int myMethod(int y, String name) {
        System.out.println(name + y);
        return y;
    }

    public static void printItManyTimes(int y, String str) {
        for (int i = 0; i< y; i++) {
            System.out.println(str);
        } 
    }
    
    public static void printItManyTimes(String str, int y) {
        for (int i = 0; i< y; i++) {
            System.out.println(str);
        } 
    }

    public static void main(String[] args) {
        printItManyTimes(2,"hello");
        printItManyTimes("world",4);

        myMethod(2, "hithere");
    }

}
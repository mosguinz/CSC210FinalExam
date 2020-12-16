public class C1 {
    // method overloading
    public static void meth1(String a) {
        System.out.println(a);
    }

    public static void meth1(int a) {
        System.out.println(a * 5);
    }
}

class C2 extends C1 {
    @Override
    public static void meth1(int a) {
        System.out.println(a * 2);
    }
}

public class unary {
    public static void main(String[] args) {
        int a=5;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int b=++a + ++a + a++;
        System.out.println(b);
    }
}

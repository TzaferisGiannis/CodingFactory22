package gr.aueb.cf.myTests;


public class AddAppMethodsTest {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int sum;

        sum = add(a , b);

        System.out.println("sum =" + sum);
    }
    public static int add (int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;

    }
}

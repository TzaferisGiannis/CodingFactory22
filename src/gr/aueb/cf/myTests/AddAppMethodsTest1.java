package gr.aueb.cf.myTests;


public class AddAppMethodsTest1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int sum;

        sum = add(a , b);

        System.out.println("sum =" + sum);
    }

    /**
     *
     * @param a      the first int to add
     * @param b     the second int ot add
     * @return      the sum of a and b
     */
    public static int add (int a, int b){
       return a + b;
    }
}

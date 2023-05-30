package gr.aueb.cf.myTests;

/**
 * sum , mul of 10 first numbers
 */
public class SumMulAppTest {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;


        for (int i=1 ; i <=10 ; i++) {
            sum = sum + i;
            mul = mul * i;
        }
        System.out.println("sum is: "+sum);
        System.out.println("mul is : " + mul);

    }
}

package gr.aueb.cf.ch6ArraysTest;

public class ArrayPopulatedHardCodedTest {

    public static void main(String[] args) {
        int[] ages = new int[6];
        ages[0] =18;
        ages[1] =48;
        ages[2] =10;
        ages[3] =23;
        ages[4] =38;
        ages[5] =28;

        for( int i = 0; i < ages.length; i++ ){
            System.out.print(ages[i] + " ");
        }
    }
}

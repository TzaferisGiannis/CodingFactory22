package gr.aueb.cf.ch6ArraysTest;

public class ArrayInitializerApp {

    public static void main(String[] args) {
        int ages[];

        ages = new int[]{10, 15, 20, 21, 24};

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        for (int age : ages){
            System.out.print("// "+ age + " ");
        }
    }
}

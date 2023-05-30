package gr.aueb.cf.ch5;

/**
 * Float / Double Expressions
 */
public class Expression {

    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result ;
        double mod ;

        result = num1 / num2;
        mod = num1 % num2 ;

        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result); // .2 σημαίνει 2 δεκαδικά μπαίνει ανάμεσα στο % και στο f
        System.out.printf("%.2f %% %.2f = %.2f" , num1, num2, mod); // στο  % επειδή είναι ειδικός χαρακτήρας το βάζω 2 φορές για να εμφανιστέι %%
    }
}

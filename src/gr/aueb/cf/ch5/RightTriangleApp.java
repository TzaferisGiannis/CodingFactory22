package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από τον χρήατη, τις a, b, c
 * όπου a είναι η υποτείνουσα και
 * b, c οι δύο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ.\
 * a^2 == b^2 + c^2
 *
 * έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a , b , c ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a - (b * b + c * c)) <= EPSILON);

        if (isRight){
            System.out.println("The triangle is right");
        } else{
            System.out.println(" The triangle is Not right");
        }

    }
}

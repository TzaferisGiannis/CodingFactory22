package gr.aueb.cf.ch4;

/**
 * Ένας μικρός βάτραχοσ θέλει να περάσει ένα ποτάμι.
 * Ο Frog βρίσκεται στην θέση x και θέλει να φτάσει
 * στη θέση Y (ή σε θέση > Y). Ο frog jumps a fixed distance
 * D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει στον στόχο του  ή να τον ξεπεράσει.
 *
 * Για παράδειγμα, αν έχουμε:
 * Χ = 10
 * Υ = 85
 * D = 30
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10 και μετά το 1ο jump πάει στην θέση 10 + 30 = 40
 * Στο 2ο jump παει 40 + 30 = 70
 * και στο 3ο jump παει 70 + 30 = 100
 */

public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("jumps: " + jumps);



    }
}

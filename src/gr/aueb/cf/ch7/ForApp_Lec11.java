package gr.aueb.cf.ch7;

/**
 * lesson 11 -- 2:42
 */
public class ForApp_Lec11 {

    public static void main(String[] args) {
        String s = "Coding Factory";

//        String substring = s. substring(0, 6);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\u2764");

        for (char ch : s.toCharArray()){
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        int index = s.indexOf("od"); // η indexOf μας δίνει την πρώτη εμφάνιση
        System.out.println(index);

        int index1 = s.indexOf("o", 7); // η indexOf μας δίνει από την θέση 7
        System.out.println(index1);

        int index2 = s.lastIndexOf("o", 7); // ξεκινάει από το τέλος
        System.out.println(index2);

        if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}

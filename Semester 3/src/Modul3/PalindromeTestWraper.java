package Modul3;

import java.util.Scanner;

public class PalindromeTestWraper {

    final String isMsg = "Termasuk Palingdrome";
    final String isNotMsg = "Tidak termasuk Palingdrome";

    public static void main(String args[]) {
        PalindromeTestWraper palindrometestwraper = new PalindromeTestWraper();
    }

    public PalindromeTestWraper() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Kata : ");
        String a = scan.nextLine();

        if (isPalindrome(a)) {
            System.out.println(a + " : " + isMsg);
        } else {
            System.out.println(a + " : " + isNotMsg);
        }
    }

    public static boolean isPalindrome(String s) {
        stack in = new stack();
        for (int i = 0; i < s.length(); i++) {
            in.push(s.charAt(i));
        }
        System.out.println(in.toString());
        String puter = "";
        while(!in.isEmpty()){
            puter += in.pop();
        }
//        if (s.charAt(i) != s.charAt(j)) {
//            return false;
//        }

        return s.equals(puter);
    }

}

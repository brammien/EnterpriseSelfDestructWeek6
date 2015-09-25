package com.example;

public class EnterpriseSelfDestructMyClass {

    public static void main(String[] args) {

        int Sequence1 = 111;
        int Sequence2 = 112;
        int Sequence3 = 113;
        int Sequence4 = 0000;

        if ((Sequence1 == 111) && (Sequence2 == 112) && (Sequence3 == 113) && (Sequence4 == 0000)) {
            System.out.println("Kirt, Spock, Scott, and Kirt final detination code accepted");
            System.out.println("Destroy Sequence Initiated, Destroy Starship Enterprise 30 Secs");
        } else {
            System.out.println("Invalid Sequence Code");
            System.out.println("Access Denied");
        }
    }
}

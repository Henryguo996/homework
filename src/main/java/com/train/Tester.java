package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your buy tickets： ");
        int Tickin = s.nextInt();
        System.out.println("Please Enter your buy roundtickets： ");
        int RoundTickin = s.nextInt();

        Tickets tickets = new Tickets(Tickin,RoundTickin);
        tickets.ticketTotal();


    }
}

package com.train;

public class Tickets {
    int Goto ;
    double GoBack ;

    public Tickets(int Goto,double Goback){
        this.Goto = Goto;
        this.GoBack = GoBack;

    }
    public void ticketTotal(){
        double total = ((Goto - GoBack) * 1000) + ((Goto - GoBack) * 2000 * 0.9);
        System.out.println("Goto: " + Goto + "\t" + "GoBack: " + GoBack + "TotalTickets: " + total );
    }

}

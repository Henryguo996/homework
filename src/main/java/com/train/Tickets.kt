package com.train

import sun.jvm.hotspot.runtime.DeadlockDetector.print
import java.util.*
class Tickets (val GoTicket: Int,val RoundTicket: Int){
    fun GoorBack(){
        var totalkt = (GoTicket - RoundTicket) * 1000 + (RoundTicket*2000-0.9).toInt();
        print("Total tickets:  $GoTicket \n RoundTicket: $RoundTicket \n Total: $totalkt" )
    }
}

fun main(){
    val s = Scanner(System.`in`)
    print("Please enter your tickets: ")
    var numbergoticket = s.nextInt();
    print("Please enter your roundtickets: ")
    var numberroundtickets = s.nextInt();
    val ticketTotal = Tickets(numbergoticket,numberroundtickets)
    ticketTotal.GoorBack()
}

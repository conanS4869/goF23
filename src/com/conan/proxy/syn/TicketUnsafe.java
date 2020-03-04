package com.conan.proxy.syn;

public class TicketUnsafe {
    public static void main(String[] args) {
        Ticket station= new Ticket() ;
        new Thread(station,"1").start();
        new Thread(station,"2").start();
        new Thread(station,"3").start();
    }
}

class Ticket implements Runnable{
private int ticketNums =10;
boolean flag=true;
    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }

    private void buy() {
        if (ticketNums <= 0) {
            flag=false;
            return;
        }

        System.out.println(Thread.currentThread().getName()+"拿到"+ ticketNums--);
    }
}

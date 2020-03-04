package com.conan.proxy.syn;

public class BankUnsafe {
    public static void main(String[] args) {
        Account account = new Account(100, "conan的钱");
        Drawing you = new Drawing(account, 50, "你");
        Drawing wife = new Drawing(account, 100, "你老婆");
        wife.start();
        you.start();

    }
}

//账户
class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//银行

class Drawing extends Thread {
    Account account;
    //要取多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        if (account.money - drawingMoney < 0) {
            System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money = account.money - drawingMoney;
        nowMoney = nowMoney + drawingMoney;
        System.out.println(account.name + "余额为：" + account.money);
        //Thread.currentThread().getName() == this.getName()
        System.out.println(this.getName() + "手里的钱= " + nowMoney);

    }
}



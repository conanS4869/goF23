package com.conan.proxy.syn;

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "conan");
        Makeup g2 = new Makeup(1, "sherry");
        g1.start();
        g2.start();
    }
}

class Lipstick {

}

class Mirror {

}

class Makeup extends Thread {
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girlName;

    Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        //化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipstick) { //获得口红的锁
                System.out.println(this.girlName + "获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror) {
                System.out.println(this.girlName + "获得镜子的锁");
            }
        } else {
            synchronized (mirror) { //获得口红的锁
                System.out.println(this.girlName + "获得镜子的锁");
                Thread.sleep(2000);
            }
            // synchronized 放在外部解除死锁
            synchronized (lipstick) {
                System.out.println(this.girlName + "获得口红的锁");
            }
        }
    }
}

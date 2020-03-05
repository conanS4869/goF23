package com.conan.proxy.pc;

public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        new Productor(container).start();
        new Customer(container).start();
    }
}

class Productor extends Thread {
    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了" + i + "只鸡");
        }
    }
}

class Customer extends Thread {
    SynContainer container;

    public Customer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->" + container.pop().id + "只鸡");
        }
    }
}

class Chicken {
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}

class SynContainer {
    //容器大小
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    public synchronized void push(Chicken chicken) {
//容器满了，等待消费者消费
        if (count == chickens.length) {
            //通知消费者，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //没有满，继续丢入产品
        chickens[count] = chicken;
        count++;

        this.notifyAll();
    }

    public synchronized Chicken pop() {
        if (count == 0) {
            //等待生产者
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //可以消费，消费
        count--;
        Chicken chicken = chickens[count];

        this.notifyAll();
        return chicken;
    }
}


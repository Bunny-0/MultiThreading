package org.example;
class Test1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("i am inside Test1");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Test extends Thread{
    public void run(){

        for(int i=0;i<=5;i++){
        System.out.println("i am inside Test");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test t=new Test();
        t.start();
        Thread t1=new Thread(new Test1());
        t1.start();
        for(int i=0;i<=5;i++){
            System.out.println("i am inside Main");
            Thread.sleep(1);
        }

    }
}
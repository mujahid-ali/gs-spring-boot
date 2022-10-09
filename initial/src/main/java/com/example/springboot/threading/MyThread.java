class MyTask extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Thread @@ : " + i);
        }
    }
}

class MyThread2 implements Runnable {

    //Runnable r2 = new Thread(new MyThread3());
    //r2.start();
    MyThread3 thread3 = new MyThread3();
    Thread t3 = new Thread(thread3);
    //t3.start();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("%%%% MyThread2 : " + i);
        }
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("&&&& MyThread3 : " + i);
        }
    }
}

public class MyThread {

    public static void main(String[] args) {

        System.out.println("Main start here");

        //MyTask task = new MyTask();
        //task.start();

        Runnable r = new Thread(new MyThread2());
        r.start();
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Main #### : " + i);
        }
    }
}


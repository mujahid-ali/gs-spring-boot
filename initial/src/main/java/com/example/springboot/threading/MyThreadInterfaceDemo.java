public class MyThreadInterfaceDemo implements Runnable {

    public void run() {
        System.out.println("Runnable interface Demo");
    }
    

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadInterfaceDemo());
        thread1.start();
    }
}

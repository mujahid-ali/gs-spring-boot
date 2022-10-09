class Printer {

    //synchronized void printDocs(int num, String docName) {
    void printDocs(int num, String docName) {
        for (int i = 0; i < num; i++) { 
            System.out.println(">> Printing " + docName  + " " + i);
        }
    }
}

class MyThread extends Thread {
    Printer pref;

    MyThread(Printer p) {
        pref = p;
    }

    @Override
    public void run() {
        synchronized (pref) {
            pref.printDocs(5, "ali.pdf");
        }
    }
}

class YourThread extends Thread {
    Printer pref;

    YourThread(Printer p) {
        pref = p;
    }

    @Override
    public void run() {
        synchronized (pref) {
            pref.printDocs(5, "Hamnah.pdf");
        }
    }
}

public class SyncApp {

    public static void main(String[] args) {

        System.out.println("=== App Started ===");

        Printer pRef = new Printer();

        MyThread mRef = new MyThread(pRef);
        YourThread yRef = new YourThread(pRef);

        mRef.start();
       
        /*
        try {
            //yRef.join();
            mRef.join();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        */

        yRef.start();
        
        
               System.out.println("===App Finished===");
    }
    
}

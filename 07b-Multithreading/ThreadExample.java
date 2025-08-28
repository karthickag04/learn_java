class MyThread extends Thread {
    
    public void run() {
        // This code runs in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }

   

}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create thread object
        t1.start(); // start the thread → calls run() internally

        // main thread also doing work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main running: " + i);
        }
        
    }
}

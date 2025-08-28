class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread running: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable(); 
        Thread t1 = new Thread(task); // pass runnable to thread
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main running: " + i);
        }
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        System.out.println("Starting Thread1...");
        thread1.start();

        try {
            Thread.sleep(4000); // Pause for 4 seconds to demonstrate thread blocking
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Starting Thread2...");
        thread2.start();

        try {
            thread1.join(); // Wait for Thread1 to complete
            thread2.join(); // Wait for Thread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed.");
    }
}

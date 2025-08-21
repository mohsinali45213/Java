

class R1 extends Thread {
    public void run() {
        System.out.println("Thread R1 is running");
    }
}

class R2 implements Runnable {
    public void run() {
        System.out.println("Thread R2 is running");
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        Thread t1 = new R1();
        t1.start();

        Thread t2 = new Thread(new R2());
        t2.start();
    }
}

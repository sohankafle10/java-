


class Main{
    synchronized public void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i); // Changed n*1 to n*i
        }
    }
}

class ThreadFirst extends Thread {
    Calculate c;
    public ThreadFirst(Calculate c) {
        this.c = c;
    }
    public void run() {
        c.mul(5); // Changed C to c
    }
}

class ThreadSecond extends Thread {
    Calculate c;
    public ThreadSecond(Calculate c) {
        this.c = c;
    }
    public void run() {
        c.mul(10); // Changed C to c
    }
}

class Test {
    public static void main(String args[]) { // Changed run to main
        Calculate obj = new Calculate();
        ThreadFirst t1 = new ThreadFirst(obj);
        ThreadSecond t2 = new ThreadSecond(obj);
        t1.start();
        t2.start();
    }
}

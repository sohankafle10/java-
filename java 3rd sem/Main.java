


class Calculate{
    synchronized public void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i); 
        }
    }
}

class ThreadFirst extends Thread {
    Calculate c;
    public ThreadFirst(Calculate c) {
        this.c = c;
    }
    public void run() {
        c.mul(5); 
    }
}

class ThreadSecond extends Thread {
    Calculate c;
    public ThreadSecond(Calculate c) {
        this.c = c;
    }
    public void run() {
        c.mul(10); 
    }
}

class Main{
    public static void main(String args[]) { 
        Calculate c= new Calculate();
        ThreadFirst t1 = new ThreadFirst(c);
        ThreadSecond t2 = new ThreadSecond(c);
        t1.start();
        t2.start();
    }
}





package lr5;

    class MyThread extends Thread {
        MyThread(String name) {
            super(name);
        }

        public void run() {
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                System.out.println("Поток был прерван");
            }
        }
    }

    public class Example4 {
        public static void main(String[] args) {
            System.out.println("Главный поток запущен");
            new MyThread("MyThread-1").start();
            new MyThread("MyThread-2").start();
            new MyThread("MyThread-3").start();
            new MyThread("MyThread-4").start();
            new MyThread("MyThread-5").start();
            new MyThread("MyThread-6").start();
            new MyThread("MyThread-7").start();
            new MyThread("MyThread-8").start();
            new MyThread("MyThread-9").start();
            new MyThread("MyThread-10").start();
        }
}

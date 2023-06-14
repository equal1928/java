package lr5;

public class Example5 {
    private static final Object lock = new Object();
    final static int[] arrayList = new int[] {15,48, 60,54,3,188,16};
    private static int length = arrayList.length;
    private static int max = 0;
    public static void main(String[] args) throws InterruptedException{
        Thread lengthEvenThread = new Thread(() -> {
            synchronized (lock) {
                while (length !=0) {
                    if (length % 2 == 0) {
                        System.out.println((Thread.currentThread().getName() + ": " + arrayList[length -1]));
                        if (arrayList[length - 1] > max) {
                            max = arrayList[length-1];
                        }
                        length--;
                    }
                    else {
                        try {
                            Thread.sleep(500);
                            lock.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        Thread lengthOddThread = new Thread(() -> {
            synchronized (lock) {
                while (length !=0) {
                    if (length % 2 != 0) {
                        System.out.println((Thread.currentThread().getName() + ": " + arrayList[length -1]));
                        if (arrayList[length - 1] > max) {
                            max = arrayList[length-1];
                        }
                        length--;
                    }
                    else {
                        try {
                            Thread.sleep(500);
                            lock.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        lengthEvenThread.start();
        lengthOddThread.start();
        lengthEvenThread.join();
        lengthOddThread.join();
        System.out.printf("Максимальное число %s\n",max);
    }
}

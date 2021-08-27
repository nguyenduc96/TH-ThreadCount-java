public class Count implements  Runnable{
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Đang in : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng đang bị gián đoạn");
        }
        System.out.println("Luồng đã chạy xong");
    }
}

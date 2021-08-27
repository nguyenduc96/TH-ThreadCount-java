public class Main {

    public static void main(String[] args) {
        Count count = new Count();

        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Chuỗi chính sẽ tồn tại cho đến khi chuỗi con hoạt động");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng bị gián đoạn");
        }
        System.out.println("Luồng đã chạy xong");
    }
}

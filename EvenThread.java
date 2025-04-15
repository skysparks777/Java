public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EvenThread thread = new EvenThread();
        thread.start();
    }
}

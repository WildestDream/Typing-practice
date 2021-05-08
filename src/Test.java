import java.util.Random;
import java.util.Scanner;

public class Test {

    private static final int INTERVAL = 1500;
    private static int TIMES = 100;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            //中间三排
            //char[] chars = {'a', 's', 'd', 'f'};
            //char[] chars = {'j', 'k', 'l', ';'};
            //char[] chars = {'a', 's', 'd', 'f', 'j', 'k', 'l', ';'};
            //char[] chars = {'g', 'h'};
            char[] chars = {'a', 's', 'd', 'f', 'j', 'k', 'l', ';', 'g', 'h'};

            //上左三排
            //char[] chars = {'q','w','e','r',     'a', 's', 'd', 'f', 'j', 'k', 'l', ';', 'g', 'h'};

            //右上角
            //char[] chars = {'u', 'i', 'o', 'p', 'q','w','e','r',     'a', 's', 'd', 'f', 'j', 'k', 'l', ';', 'g', 'h'};

            Random random = new Random();
            while (true) {
                if (TIMES-- == 0) {
                    System.out.println("\n训练结束");
                    break;
                }
                int index = random.nextInt(chars.length);
                System.out.print("\n" + chars[index] + " ");
                try {
                    Thread.sleep(INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
            }
        });
        thread2.setDaemon(true);
        thread2.start();
    }
}

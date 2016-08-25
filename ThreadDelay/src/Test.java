/**
 * Created by 32967 on 2016/8/25.
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+":1");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":2");
        new Thread(new Runnable() {

            int i = 0;

            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i++;
                    if (i>10) break;
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println(Thread.currentThread().getName()+":3");
    }
}

package Java3.lessons.lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MainClass {

    public static final int CARS_COUNT = 4;
    public static final CountDownLatch START = new CountDownLatch(CARS_COUNT + 1);
    public static final CountDownLatch END = new CountDownLatch(CARS_COUNT);
    public static final Semaphore TUNNEL_SEM = new Semaphore(CARS_COUNT/2, true);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));

        for (int i = 0; i < CARS_COUNT; i++)
            new Thread(new Car(i, race, 20 + (int) (Math.random() * 10))).start();

        while(START.getCount() > 1) Thread.sleep(100);

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        START.countDown();

        END.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}


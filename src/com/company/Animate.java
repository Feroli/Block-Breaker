package com.company;

/**
 * Created by Feroli on 23/08/2015.
 */
public class Animate implements Runnable {

    BlockBreakerPanel bp;

    public Animate(BlockBreakerPanel b) {
        bp = b;
    }

    @Override
    public void run() {

        while (true) {
            try {
            bp.update();

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

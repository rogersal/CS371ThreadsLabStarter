package edu.up.cs301threadslab;

import java.util.Random;

public class StarThread extends Thread {
    private StarAnimation s;

    public StarThread(StarAnimation t){
        s = t;
    }

    @Override
    public void run() {
        synchronized (s) {
            try {
                sleep(40);
            } catch (InterruptedException except) {
                except.printStackTrace();
            }
            Random r = new Random();
            int i = r.nextInt(10);
            if (i % 2 == 0) {
                s.addStar();
            } else {
                s.removeStar();
            }
        }
    }
}

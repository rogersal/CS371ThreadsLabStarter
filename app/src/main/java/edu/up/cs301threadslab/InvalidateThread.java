package edu.up.cs301threadslab;

import android.view.View;

public class InvalidateThread extends Thread {
    private AnimationView myAV;
    public InvalidateThread(AnimationView v){
        myAV = v;
    }
    @Override
    public void run() {
        while(true) {
            myAV.postInvalidate();
            try {
            sleep(3000);

            } catch (InterruptedException except) {
                except.printStackTrace();
            }
        }
    }
}

package patterns.structural.bridge.impl;

import patterns.structural.bridge.DrawAPI;

/**
 * Created on 19.08.16.
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Color : red, radius : " + radius + ", x : " + x + ", y : " + y);
    }
}

package figure.impl;

import figure.Figure;
import utils.Constants;

public class Ball implements Figure {
    private final double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        if (radius < 0){
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

package figure.impl;

import figure.Figure;
import utils.Constants;

public class Cube implements Figure {
    private final double height;

    public Cube(double height) {
        this.height = height;
    }

    public double getVolume() {
        if (height < 0){
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return Math.pow(height,3);
    }
}

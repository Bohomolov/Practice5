package figure.impl;

import figure.Figure;
import utils.Constants;

public class Pyramid3Angles implements Figure {
    private final double height;
    private final double baseArea;

    public Pyramid3Angles(double height, double baseArea) {
        this.height = height;
        this.baseArea = baseArea;
    }

    public double getVolume() {
        if (height < 0 || baseArea < 0) {
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return (1.0 / 3.0) * baseArea * height;
    }
}

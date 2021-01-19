package figure.impl;

import figure.Figure;
import utils.Constants;

public class Pyramid4Angles implements Figure {
    private final double baseSide;
    private final double height;

    public Pyramid4Angles(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    public double getVolume() {
        if (baseSide < 0 || height < 0) {
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return (1.0 / 3.0) * height * Math.pow(baseSide, 2);
    }
}

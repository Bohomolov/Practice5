package figure.impl;

import figure.Figure;
import utils.Constants;

public class Cylinder implements Figure {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

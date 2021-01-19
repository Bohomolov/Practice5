package figure.impl;

import figure.Figure;
import utils.Constants;

public class Parallelepiped implements Figure {
    private final double baseArea;
    private final double height;

    public Parallelepiped(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getVolume() {
        if (baseArea < 0 || height < 0) {
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        return baseArea * height;
    }
}

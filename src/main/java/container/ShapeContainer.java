package container;

import figure.Figure;
import utils.Constants;

public class ShapeContainer {
    private final Figure[] figures;
    private final double containerVolume;
    private double containerOccupiedVolume;
    private final int capacity;

    public ShapeContainer() {
        capacity = 10;
        figures = new Figure[this.capacity];
        containerVolume = 100;
        containerOccupiedVolume = 0;
    }

    public ShapeContainer(int capacity) {
        this.capacity = capacity;
        figures = new Figure[this.capacity];
        containerVolume = capacity * 10;
        containerOccupiedVolume = 0;
    }

    public boolean addShape(Figure figure) {
        if (figure == null) {
            throw new IllegalArgumentException(Constants.FIGURE_IS_NULL);
        } else if (figure.getVolume() < 0) {
            throw new IllegalArgumentException(Constants.ILLEGAL_ARGUMENT);
        }
        double figureVolume = figure.getVolume();
        if (figureVolume + containerOccupiedVolume <= containerVolume) {
            this.containerOccupiedVolume += figureVolume;
            for (int i = 0; i < figures.length; i++) {
                if (figures[i] == null) {
                    figures[i] = figure;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

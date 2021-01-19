package container;

import figure.Figure;
import figure.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Constants;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class ShapeContainerTest {
    private final ShapeContainer shapeContainer;
    private final Figure figure_null;
    private final Figure figure_negative;

    ShapeContainerTest() {
        shapeContainer = new ShapeContainer();
        figure_null = null;
        figure_negative = new Cube(-80);
    }


    static Stream<Arguments> shapeContainerTest() {
        return Stream.of(
                arguments(new Ball(5), false),
                arguments(new Ball(0), true),
                arguments(new Cone(1.2, 3), true),
                arguments(new Cube(30), false),
                arguments(new Cylinder(1, 9), true),
                arguments(new Parallelepiped(10, 15), false),
                arguments(new Pyramid4Angles(3, 9), true)
        );
    }

    @ParameterizedTest(name = "Shape container test. Input data is {0}, {1} ")
    @MethodSource("shapeContainerTest")
    void shapeContainerTest_0(Figure shape, boolean expected) {
        boolean actual = shapeContainer.addShape(shape);
        assertEquals(expected, actual);
    }

    @Test
    public void shapeContainerTest_exception_null() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            shapeContainer.addShape(figure_null);
        }, Constants.FIGURE_IS_NULL);
    }

    @Test
    public void shapeContainerTest_exception_negative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            shapeContainer.addShape(figure_negative);
        }, Constants.ILLEGAL_ARGUMENT);
    }
}
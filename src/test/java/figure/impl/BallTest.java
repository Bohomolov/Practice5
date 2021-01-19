package figure.impl;

import figure.Figure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Constants;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BallTest {
    private final Ball ballNegative;

    public BallTest() {
        ballNegative = new Ball(-99);
    }

    static Stream<Arguments> ballTest() {

        return Stream.of(
                arguments(new Ball(0), 0),
                arguments(new Ball(1), 4.1887902047863905),
                arguments(new Ball(5), 523.5987755982989),
                arguments(new Ball(10), 4188.790204786391),
                arguments(new Ball(11), 5575.279762570686)
        );
    }

    @ParameterizedTest(name = "Ball test. Input data {0}, {1}")
    @MethodSource("ballTest")
    void ballTest_0(Figure figure, double expected) {
        double actual = figure.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shapeContainerTest_exception_negative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ballNegative.getVolume();
        }, Constants.ILLEGAL_ARGUMENT);
    }
}
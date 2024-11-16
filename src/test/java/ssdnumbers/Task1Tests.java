package ssdnumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Tests {

    @ParameterizedTest
    @MethodSource("task1TestProvider")
    public void testVerifier(String input, boolean expResult) {
        assertEquals(expResult, SSDNumber.isSemiSelfDescriptive(input));
    }

    private static Stream<Arguments> task1TestProvider() {
        return Stream.of(
                Arguments.of("1", true),
                Arguments.of("22", true),
                Arguments.of("7777777", true),
                Arguments.of("3334444", true),
                Arguments.of("3333444", false),
                Arguments.of("44411", false),
                Arguments.of("2133443442", true)
        );
    }

}

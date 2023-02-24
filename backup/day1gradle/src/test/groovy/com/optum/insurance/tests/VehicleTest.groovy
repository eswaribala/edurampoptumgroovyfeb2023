package com.optum.insurance.tests

import com.optum.insurance.models.MathTools
import com.optum.insurance.models.Repository
import com.optum.insurance.services.RepoService
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import org.junit.runners.Parameterized
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

import java.sql.SQLException
import java.time.Month

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofSeconds;
import static java.time.Duration.ofMinutes;
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.stream.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
@Tag("Development")
@ExtendWith(MockitoExtension.class)

class VehicleTest {
    @BeforeAll
    static void init() {
        def logger = Logger.getLogger(VehicleTest.name)
        logger.level = Level.FINE
        logger.addHandler(new ConsoleHandler(level: Level.FINE))
    }

//lifecycle
    @BeforeAll
    static void beforeAll() {
        System.out.println("Connect to the database");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Load the schema");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Drop the schema");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Disconnect from the database");
    }

    @Test
    void testOne() {
        System.out.println("Test One");
    }

    @Test
    void testTwo() {
        System.out.println("Test Two");
    }


    @Test
    void streamSum() {
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5")
    }
    @RepeatedTest(value=2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void streamSumRepeated() {
        assert Stream.of(1, 2, 3).mapToInt(i -> i).sum() == 6
    }

    private boolean isPalindrome(s) { s == s.reverse()  }

    @ParameterizedTest
    @ValueSource(strings = [ "racecar", "radar", "able was I ere I saw elba" ])
    void palindromes(String candidate) {
        assert isPalindrome(candidate)
    }

    @TestFactory
    def dynamicTestCollection() {[
           DynamicTest.dynamicTest("Add test") { -> assert 1 + 1 == 2 },
           DynamicTest.dynamicTest("Multiply Test", () -> { assert 2 * 3 == 6 })
    ]}

    @Test
    void testConvertToDecimalSuccess() {
        double result = MathTools.convertToDecimal(3, 4);
        Assertions.assertEquals(0.75, result);
    }

    @Test
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
    }

    @Test
    @DisplayName("String Examples")
    void stringExamples() {
        String s1 = "Hello";
        String s2 = "Hello";

        assertThat("Comparing Strings", s1, is(s2));
        assertThat(s1, equalTo(s2));
        assertThat(s1, sameInstance(s2));
        assertThat("ABCDE", containsString("BC"));
        assertThat("ABCDE", not(containsString("EF")));
    }

    @Test
    @DisplayName("List Examples")
    void listExamples() {
        // Create an empty list
        List<String> list = new ArrayList<>();
        assertThat(list, isA(List.class));
        assertThat(list, empty());

        // Add a couple items
        list.add("One");
        list.add("Two");
        assertThat(list, not(empty()));
        assertThat(list, hasSize(2));
        assertThat(list, contains("One", "Two"));
        assertThat(list, containsInAnyOrder("Two", "One"));
        assertThat(list, hasItem("Two"));
    }

    @Test
    @DisplayName("Number Examples")
    void numberExamples() {
        assertThat(5, lessThan(10));
        assertThat(5, lessThanOrEqualTo(5));
        assertThat(5.01, closeTo(5.0, 0.01));
    }

    @Mock
    Repository repository;

    @InjectMocks
    RepoService service;

    @Test
    void testSuccess() {
        // Setup mock scenario
        try {
            Mockito.when(repository.getStuff()).thenReturn(Arrays.asList("A", "B", "CDEFGHIJK", "12345", "1234"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate the response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(3, stuff.size());
    }

    @Test
    void testException() {
        // Setup mock scenario
        try {
            Mockito.when(repository.getStuff()).thenThrow(new SQLException("Connection Exception"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate the response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(0, stuff.size());
    }

    @ParameterizedTest
    @MethodSource("generateEvenNumbers")
    void testIsEvenRange(int number) {
        Assertions.assertTrue(MathTools.isEven(number));
    }

    static IntStream generateEvenNumbers() {
        return IntStream.iterate(0, i -> i + 2).limit(500);
    }


    @ParameterizedTest
    @EnumSource( value = Month.class, names = ["APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "FEBRUARY"], mode = EnumSource.Mode.EXCLUDE)
    void exceptFourMonths_OthersAre31DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(31, month.length(isALeapYear));
    }
    @ParameterizedTest
    @CsvSource(["test,TEST", "tEst,TEST", "Java,JAVA"])
    void toUpperCase_ShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }


    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }
}

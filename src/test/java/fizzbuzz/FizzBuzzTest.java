package fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzTest {

    @Nested
    class Given_Fizz_Buzz_instance {

        private FizzBuzz fizzBuzz;

        @BeforeEach
        void setUp() {
            // given
            fizzBuzz = new FizzBuzz();
        }

        @Test
        void return_one_when_get_one() {
            // when
            String result = fizzBuzz.display(1);
            // then
            assertThat(result).isEqualTo("1");
        }

        @Test
        void return_two_when_get_two() {
            // when
            String result = fizzBuzz.display(2);
            // then
            assertThat(result).isEqualTo("2");
        }

        @Test
        void return_fizz_when_multiple_of_3() {
            // when
            String result = fizzBuzz.display(3);
            // then
            assertThat(result).isEqualTo("fizz");
        }

        @Test
        void return_buzz_when_multiple_of_5() {
            // when
            String result = fizzBuzz.display(5);
            // then
            assertThat(result).isEqualTo("buzz");
        }

        @Test
        void return_fizz_buzz_when_multiple_of_3_and_5() {
            // when
            String result = fizzBuzz.display(15);
            // then
            assertThat(result).isEqualTo("fizzbuzz");
        }
    }
}

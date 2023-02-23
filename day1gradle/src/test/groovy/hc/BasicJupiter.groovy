package hc

import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import java.util.stream.Stream

import static org.junit.jupiter.api.Assertions.assertTrue

class BasicJupiter {

	
	@Test
  void streamSum() {
    assertTrue(Stream.of(1, 2, 3)
      .mapToInt{i -> i}
      .sum() > 5, { -> "Sum should be greater than 5"})
  }

  @RepeatedTest(value=2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
  void streamSumRepeated() {
    assert Stream.of(1, 2, 3).mapToInt{i -> i}.sum() == 6
  }

  
  private boolean isPalindrome(s) { s == s.reverse()  }

  @ParameterizedTest
  @ValueSource(strings = [ "racecar", "radar", "able was I ere I saw elba" ])
  void palindromes(String candidate) {
	assert isPalindrome(candidate)
  }

  
    

  

  
  
}

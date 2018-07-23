package data.structures.algorithms.numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

import data.structures.algorithms.numbers.Numbers;

public class NumbersTest {

	@Test
	public void testResultIsGreaterValid() {
		// Given;
		int firstValue = 10, secondValue = 512;

		// When:
		int result = Numbers.createNumberFrom(firstValue, secondValue);

		// Then:
		assertThat("The result value should be equal to " + result, result, equalTo(15012));
	}

	@Test
	public void testResultIsGreaterThan1000000() {
		// Given;
		int firstValue = 10256, secondValue = 512;

		// When:
		int result = Numbers.createNumberFrom(firstValue, secondValue);

		// Then:
		assertThat("The result value should be equal to " + result, result, equalTo(-1));
	}

}

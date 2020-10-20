package pl.backlog.green;

import static org.junit.Assert.*;
import org.junit.Test;


public class GeniusLibraryTest {
    @Test
    public void methodShouldReturnCorrectValue() {
        // given
		
		// when
		double area = GeniusLibrary.calculateAreaOfCircle(4.0);
		
		// then
		assertEquals(50.2655, area, 0.001);
    }
}
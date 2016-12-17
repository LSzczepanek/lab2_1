package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class TestSearchMethod {

	
	@Test
	public void testIsElementFoundInSequence(){
		int key = 4;
		int[] seq = {4};
		
		assertTrue(BinarySearch.search(key, seq).isFound());
	}
	
}

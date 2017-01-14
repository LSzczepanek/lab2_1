package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestSearchMethod {

	
	@Test
	public void testElementExistInSingleSequence(){
		int key = 4;
		int[] seq = {4};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertTrue(result.isFound() && (seq[result.getPosition()] == key));
	}
	
	
	@Test
	public void testElementNotExistInSingleSequence(){
		int key = 7;
		int[] seq = {4};
		
		assertFalse(BinarySearch.search(key, seq).isFound());
	}
	
	@Test
	public void testElementIsFirstInSequence(){
		int key = 5;
		int[] seq = {5,6,7};
		assertEquals(0, BinarySearch.search(key, seq).getPosition());
	}
	
	
	@Test
	public void testElementIsLastInSequence(){
		int key = 7;
		int[] seq = {5,6,7};
		assertEquals(seq.length-1, BinarySearch.search(key, seq).getPosition());
	}
	
	@Test
	public void testElementIsMiddleInSequence(){
		int key = 6;
		int[] seq = {5,6,7};
		assertEquals(1, BinarySearch.search(key, seq).getPosition());
	}
	
	
	@Test
	public void testElemenetExistInLongerSequence(){
		int key = 4;
		int[] seq = {4,5,6,7};
		
		assertTrue(BinarySearch.search(key, seq).isFound());
	}
	
}

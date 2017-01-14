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
		SearchResult result = BinarySearch.search(key, seq);
		
		assertTrue((result.isFound() == false) && result.getPosition() == -1);
	}
	
	@Test
	public void testElementIsFirstInSequence(){
		int key = 5;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertEquals(0, result.getPosition());
	}
	
	
	@Test
	public void testElementIsLastInSequence(){
		int key = 7;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertEquals(seq.length-1, result.getPosition());
	}
	
	@Test
	public void testElementIsMiddleInSequence(){
		int key = 6;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertEquals(1, result.getPosition());
	}
	
	
	@Test
	public void testElemenetExistInLongerSequence(){
		int key = 4;
		int[] seq = {4,5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertTrue(result.isFound());
	}
	
}

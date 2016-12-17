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
	
	
	@Test
	public void testIsNotElementFoundInSequence(){
		int key = 7;
		int[] seq = {4};
		
		assertFalse(BinarySearch.search(key, seq).isFound());
	}
	
	@Test
	public void testIsElementFirstElement(){
		int key = 5;
		int[] seq = {5,6,7};
		assertEquals(1, BinarySearch.search(key, seq).getPosition());
	}
	
	
	@Test
	public void testIsElementLastElement(){
		int key = 7;
		int[] seq = {5,6,7};
		assertEquals(seq.length-1, BinarySearch.search(key, seq).getPosition());
	}
	
	@Test
	public void testIsElementMiddleElement(){
		int key = 6;
		int[] seq = {5,6,7};
		assertEquals(1, BinarySearch.search(key, seq).getPosition());
	}
	
}

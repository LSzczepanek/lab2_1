package lab2_1;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestSearchMethod {

	
	@Test
	public void testElementExistInSingleSequence(){
		int key = 4;
		int[] seq = {4};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.isFound(), is(true));
		assertThat(seq[result.getPosition()], is(equalTo(key)));
	}
	
	
	@Test
	public void testElementNotExistInSingleSequence(){
		int key = 7;
		int[] seq = {4};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.isFound(), is(false));
		assertThat(result.getPosition(), is(equalTo(-1)));
	}
	
	@Test
	public void testElementIsFirstInSequence(){
		int key = 5;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.getPosition(), is(equalTo(0)));
	}
	
	
	@Test
	public void testElementIsLastInSequence(){
		int key = 7;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.getPosition(), is(equalTo(seq.length-1)));
	}
	
	@Test
	public void testElementIsMiddleInSequence(){
		int key = 6;
		int[] seq = {5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.getPosition(), is(equalTo(1)));
	}
	
	
	@Test
	public void testElemenetExistInLongerSequence(){
		int key = 4;
		int[] seq = {4,5,6,7};
		SearchResult result = BinarySearch.search(key, seq);
		
		assertThat(result.isFound(), is(true));
		assertThat(seq[result.getPosition()], is(equalTo(key)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWhenSequenceIsEmpty(){
		int key = 4;
		int[] seq = {};

		BinarySearch.search(key, seq);
	}
	
	@Test
	public void testWhenKeyValueIsZero(){
		int key = 0;
		int[] seq = {0,5,6,7};

		SearchResult result = BinarySearch.search(key, seq);

		assertThat(result.isFound(), is(true));
		assertThat(seq[result.getPosition()], is(equalTo(key)));
	}
	
	@Test
	public void testWhenKeyIsNegative(){
		int key = -5;
		int[] seq = {4,-5,6,7};

		SearchResult result = BinarySearch.search(key, seq);

		assertThat(result.isFound(), is(true));
		assertThat(seq[result.getPosition()], is(equalTo(key)));
	}
	
}

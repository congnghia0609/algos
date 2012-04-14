package org.bk.algo.sort.algo05.quick;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;
import static org.junit.Assert.assertThat;

import org.bk.algo.sort.SortFixtures;
import org.bk.algo.sort.algo05.quick.QuickSort;
import org.junit.Test;

public class QuickSortTest {
	
	@Test
	public void testForASmallArrayOfIntegers(){
		Integer[] arr = SortFixtures.fixture1();
		QuickSort.sort(arr);
		assertThat(arr, is(arrayContaining(SortFixtures.fixture1Expected())));
	}
	
   @Test
   public void testForASmallArrayOfIntegersWithRepeatingValues(){
        Integer[] arr = SortFixtures.fixture2();
        QuickSort.sort(arr);
        assertThat(arr, is(arrayContaining(SortFixtures.fixture2Expected())));
    }
   
   @Test
   public void testForASmallArrayOfIntegersWithRepeatingValues2(){
        Integer[] arr = SortFixtures.fixture3();
        QuickSort.sort(arr);
        assertThat(arr, is(arrayContaining(SortFixtures.fixture3Expected())));
    }
   
   @Test
   public void testForASmallArrayOfIntegersValues3(){
        Integer[] arr = SortFixtures.fixture4();
        QuickSort.sort(arr);
        assertThat(arr, is(arrayContaining(SortFixtures.fixture4Expected())));
    }

}

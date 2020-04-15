package com.mujava.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mujava.main.BubbleSort;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

//@RunWith(Parameterized.class)
public class BubbleSortTest {

	private BubbleSort b =  new BubbleSort();
	int except[] = {6,2,5,1,1};
	
	@Test
	public void BubbleSortTest() {
		
		int par[] = {2,2,1,6,5};
		Assert.assertArrayEquals(except, b.BubbleSort(par));
	}

}

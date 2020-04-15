package com.mujava.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mujava.main.BackPack;
//@RunWith(Parameterized.class)
public class BackPackTest {
	private BackPack backPack = new BackPack();
	


	@Test
	public void BackPackTest() {
		int except = 133;
		int m = 100;//容量
		int n = 5;//个数
		int w[] = {12,22,29, 66,99};;//重量
		int p[] = {92,92, 77,46, 67};;//价值 
		int c[][] = backPack.BackPack_Solution(m, n, w, p);
	    int ans = c[c.length-1][c[c.length-1].length-1];     
	     Assert.assertEquals(except, ans);
	}

}

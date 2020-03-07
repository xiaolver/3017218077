package com.experiment;

import java.awt.geom.AffineTransform;
import java.util.Scanner;

import javax.swing.event.AncestorEvent;

public class Cal {

	int[] mianzhi = { 0, 50, 20, 10, 5, 1 };
	int[] num = { 0, 1, 1, 1, 2, 3 };
	int[] ans = new int[100];
	int k=0;
	public void findAll(int index,int temp) {
		index++;
		if(index==6)
		{
			ans[k++]=temp;
			return;
		}
		for(int j=0;j<=num[index];j++)
			{
				findAll(index,temp+mianzhi[index]*j);
			}
	}
	boolean find(int x) {
		for(int i=0;i<100;i++)
		{
			if(x==ans[i])return true;
		}
		return false;
	}
	public Cal() {
		findAll(0, 0);
	}

}

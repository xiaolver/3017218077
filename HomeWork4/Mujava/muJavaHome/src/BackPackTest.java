

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//@RunWith(Parameterized.class)
public class BackPackTest {
	private BackPack backPack = new BackPack();
	

	//int c[][];
	//int e[];
	//int E;
	
//	@Parameters 
//	public static Collection data() {
//		return Arrays.asList(new int[][][]{
//			{{20},{3},{5,7,9},{4,6,3},{10}},
//			{{50},{4},{16,20,12,18},{17,8,20,30},{67}},
//			{{100},{5},{77 ,22,29, 50,99},{92,22, 87,46, 90},{133}},
//			{{200},{8},{79,58,86,11,28,62,15,68},{83,14,54,79,72,52,48,62},{334}},
//			{{500},{15},{66,35,46,89,13,54,82,44,35,33,34,34,85,55,88},{80,41,46,55,18,84,88,46,75,63,37,38,86,55,78},{634}}
//		});
//		}
	
//	public  BackPackTest(int m[],int n[],int[] w,int[] p,int[] e) {
//		this.m = m;
//		this.n = n;
//		this.w = w;
//		this.p = p;
//		this.e = e;
//		this.E = e[0];
//		int M = m[0];
//	    int N = n[0];
//		this.c = backPack.BackPack_Solution(M, N, w, p);
//	}
	@Test
	public void BackPackTest() {
		int except = 133;
		int m = 100;//容量
		int n = 5;//个数
		int w[] = {77 ,22,29, 50,99};;//重量
		int p[] = {92,22, 87,46, 90};;//价值 
		int c[][] = backPack.BackPack_Solution(m, n, w, p);
	    int ans = c[c.length-1][c[c.length-1].length-1];     
	     Assert.assertEquals(except, ans);
	}

}

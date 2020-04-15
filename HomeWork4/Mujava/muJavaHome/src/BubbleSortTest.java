
import org.junit.Test;




import org.junit.Assert;

//@RunWith(Parameterized.class)
public class BubbleSortTest {

	private BubbleSort b =  new BubbleSort();
	int param[];
	int except[] = {1,2,2,5,6};
//	@Parameters 
//	public static Collection data() {
//		return Arrays.asList(new int[][]{
//			{1,2,2,5,6},
//			{1,5,2,6,2},
//			{1,5,6,2,2},
//			{6,5,2,2,1},
//			{5,6,2,1,2},
//			{5,2,6,1,2},
//			{6,5,2,1,2}
//		});
//		}
//	
//	public BubbleSortTest(int [] param) {
//		this.param = param;
//	}
	@Test
	public void BubbleSortTest() {
		
		int par[] = {2,5,6,2,1};
		Assert.assertArrayEquals(except, b.BubbleSort(par));
	}

}

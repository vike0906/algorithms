package sortAlgorithms;
/**
 * @author vike0906
 * @date 2019-07-09
 */
public class Example {
	
	public static void sort(Comparable[] a) {
		//do something
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w)<0;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	private static boolean isSorted(Comparable[] a) {
		for(int i=1;i<a.length;i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	
	public static void main(String [] args) {
		String [] randomAlphabets = RandomAlphabet.randomAlphabets();
		System.out.print("原数组： ");
		for(int i=0;i<randomAlphabets.length;i++) {
			System.out.print(randomAlphabets[i]+" ");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		sort(randomAlphabets);
		long l2 = System.currentTimeMillis();
		long l = l2-l1;
		assert isSorted(randomAlphabets);
		System.out.print("排序后： ");
		show(randomAlphabets);
		System.out.println();
		System.out.print("耗时： "+l);
		
	}

}

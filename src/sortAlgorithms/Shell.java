package sortAlgorithms;

/**
 * @author vike0906
 * @date 2019-07-09
 */
public class Shell {
	public static void sort(Comparable[] a) {
		//do something
		int N = a.length;
		int h = 1;
		while(h<N/3) h=3*h+1; //1,4,13,40,121,364,1093
		while(h>=1) {
			for(int i=1;i<N;i++) {
				for(int j=i;j>=h && less(a[j],a[j-h]);j-=h) {
					exch(a,j,j-h);
				}
			}
			h=h/3;
		}
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
		System.out.print("ԭ���飺 ");
		for(int i=0;i<randomAlphabets.length;i++) {
			System.out.print(randomAlphabets[i]+" ");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		sort(randomAlphabets);
		long l2 = System.currentTimeMillis();
		long l = l2-l1;
		assert isSorted(randomAlphabets);
		System.out.print("����� ");
		show(randomAlphabets);
		System.out.println();
		System.out.print("��ʱ�� "+l);
		
	}

}

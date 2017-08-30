package book;

public class fourQuestion {

	int[] a = new int[]{1,2,3,4};
	
	public static void main(String[] args) {
		fourQuestion fq = new fourQuestion();
		int len = fq.a.length;
		
		for(int i = 0; i < (int)(len / 2); i++) {
			int temp;
			temp = fq.a[i];
			fq.a[i] = fq.a[len -i -1];
			fq.a[len -i -1] = temp;
		}
		
		for(int i = 0; i < fq.a.length; i++) {
			System.out.print(fq.a[i]);
		}
	}

}

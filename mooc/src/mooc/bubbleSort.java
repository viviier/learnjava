package mooc;

// 冒泡排序
public class bubbleSort {
	int[] a = new int[]{564,6,456498,654123,12315,123456,111,25,132};
	
	public int[] bubbleSort(int[] a) {
		int len = a.length;
		int temp;
		String str = "";
		
		for(int outher = len; outher >= 2;outher--) {
			for(int inner = 0; inner < outher-1;inner++) {
				if(a[inner] > a[inner+1]) {
					temp = a[inner];
					a[inner] = a[inner+1];
					a[inner+1] = temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		bubbleSort parent = new bubbleSort();
		int[] a = parent.bubbleSort(parent.a);
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

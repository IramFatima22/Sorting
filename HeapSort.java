public class HeapSort {

	public static void main(String[] args) {
		int arr[]={5,7,3,17,12};
		sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(arr,i,n);
		
		for(int i=n-1;i>=0;i--){
			swap(arr,0,i);
			heapify(arr, 0, i);
		}
	}

	private static void swap(int[] arr, int i, int i2) {
		int temp=arr[i];
		arr[i]=arr[i2];
		arr[i2]=temp;
	}
	private static void heapify(int[] arr, int i, int n) {
		int max=i;
		int left=i*2+1;
		int right=i*2+2;
		if(left<n && arr[left]>arr[max])
			max=left;
		if(right<n && arr[right]>arr[max])
			max=right;
		if(max!=i){
			swap(arr,max,i);
			heapify(arr, max, n);
		}
	}
}

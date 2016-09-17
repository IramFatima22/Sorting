
public class QuickSort {

	public static void main(String[] args) {
		int arr[]={5,7,2,17,12};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr, int s, int e) {
		if(s<e){
			int ind=part(arr,s,e);
			sort(arr,s,ind-1);
			sort(arr,ind+1,e);
		}
	}
	private static int part(int[] arr, int s, int e) {
		int pivot=e;
		int start=s;
		while(s<e){
			if(arr[s]<arr[pivot]){
				swap(arr,s,start);
				start++;
			}
			s++;
		}
		swap(arr,start,pivot);
		return start;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

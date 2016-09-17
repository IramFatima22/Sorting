
public class CountingSort {

	public static void main(String[] args) {
		int arr[]={5,2,7,5,15,8};
		sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr) {
		int n=arr.length;
		int output[]=new int[n];
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		int n1=max-min+1;
		int count[]=new int[n1];
		for(int i=0;i<n;i++){
			count[arr[i]-min]++;
		}
		for(int i=1;i<n1;i++){
			count[i]+=count[i-1];
		}
		for(int i=0;i<n;i++){
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		}
		for(int i=0;i<n;i++)
			arr[i]=output[i];
	}

}

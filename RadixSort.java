
public class RadixSort {

	public static void main(String[] args) {
		int arr[]={12,17,9,23,111,73};
		sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr) {
		int max=findMax(arr);
		for(int i=1;max/i>=1;i=i*10){
			sordRadix(arr,i);
		}	
	}

	private static void sordRadix(int[] arr, int ind) {
		int output[]=new int[arr.length];
		int count[]=new int[10];
		for(int i=0;i<arr.length;i++){
			count[((arr[i]/ind)%10)]++;
		}
		for(int i=1;i<10;i++){
			count[i]+=count[i-1];
		}
		for(int i=arr.length-1;i>=0;i--){
			output[count[((arr[i]/ind)%10)]-1]=arr[i];
			count[(arr[i]/ind)%10]--;
		}
		for(int i=0;i<arr.length;i++)
			arr[i]=output[i];
		
	}

	private static int findMax(int[] arr) {
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			max=Math.max(max, arr[i]);
		}
		return max;
	}

}

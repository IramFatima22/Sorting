
public class MergeSort {

	public static void main(String[] args) {
		int arr[]={5,7,3,17,12};
		part(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void part(int[] arr, int s, int e) {
		if(s<e){
			int mid=(s+e)/2;
			part(arr,s,mid);
			part(arr,mid+1,e);
			merge(arr,s,mid,e);
		}
		
	}

	private static void merge(int[] arr, int s, int mid, int e) {
		int n1=mid-s+1;
		int n2=e-mid;
		int temp1[]=new int[n1];
		int temp2[]=new int[n2];
		int j=0;
		for(int i=s;i<=mid;i++,j++)
			temp1[j]=arr[i];
		j=0;
		for(int i=mid+1;i<=e;i++,j++)
			temp2[j]=arr[i];
		int i1=0,i2=0;
		while(i1<n1 && i2<n2){
			if(temp1[i1]<temp2[i2]){
				arr[s++]=temp1[i1++];
			}
			else{
				arr[s++]=temp2[i2++];
			}
		}
		while(i1<n1){
			arr[s++]=temp1[i1++];
		}
		while(i2<n2){
			arr[s++]=temp2[i2++];
		}
	}

}

public class KthElementOfArray{

  private int partition(Integer[] arr, int start, int end, int pivot){
		int pivotValue = arr[pivot];
		swap(pivot,end,arr);
		int j=start;
		for(int i=start;i<end;i++){
			if(arr[i]<arr[end]){
				swap(i,j,arr);
				j++;
			}
		}
		swap(j,end,arr);
		return j;
	}


	private Integer kthElement(Integer[] arr, int start, int end,int k) {
		
		int pivot = (start+end)/2;
		int pivotIndex = partition(arr,start,end,pivot);
		int pivotDist = pivotIndex - start +1;
		if(k==pivotDist){
			return arr[pivotIndex];
		}
		else 
			if(k<pivotDist){
				return kthElement(arr,start,pivotIndex-1,k);
			} 
			else {
				return kthElement(arr,pivotIndex+1,end,k-pivotDist);
			}
			
	}


	private void swap(int x, int y, Integer[] arr){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] arg) {
		Integer[] arr = {10,2,34,455,12,34,567,123,454,677,120,356,124};
		KthElementOfArray qobj = new KthElementOfArray();
		System.out.println("The 5th largest element - "+qobj.kthElement(arr,0,arr.length-1,5));
	}
}

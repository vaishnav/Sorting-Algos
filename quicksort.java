class quicksort{

  private void qsort(int[] numbers,int p,int q){
		if(p<q){
			int mid = partition(numbers,p,q);
			qsort(numbers,p,mid-1);
			qsort(numbers,mid+1,q);
		}
	}

	private int partition(int[] numbers, int p,int q){
		int pivot = numbers[q];
		int r = p-1;
		for(int j=p;j<q;j++){
			if(numbers[j]<= pivot){
				r++;
				swp(numbers,j,r);
			}
		}
		swp(numbers,r+1,q);
		return r+1;
	}

	private void swp(int[] number, int j, int r){
		int temp = number[j];
		number[j] = number[r];
		number[r] = temp;
	}

	public static void main(String arg[]){
		int[] a = {23,45,12,54,767,923,12,2,5,1};
		quicksort o = new quicksort();
		o.qsort(a,0,a.length-1	);
		for(int j =0;j<a.length;j++)
			System.out.println(a[j]);
	}
	
}

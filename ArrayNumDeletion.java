package dataStructure;


/*Deleting an element from an array takes O(n) time even if we are given index 
of the element to be deleted. The time complexity remains O(n) for sorted arrays
as well.In linked list, if we know the pointer to the previous node of the node to
be deleted, we can do deletion in O(1) time.*/

public class ArrayNumDeletion {
	public static int deletion(int arr[],int n,int x){
		int num=0;
		int index=0;
		for(int i=0;i<n;i++){
			if(arr[i]== x){
				 index=i;
			//	System.out.println(index+"index");
		num=delete(arr,x,n,index);
			}
			}
		
	return num;
	}
	public static int delete(int arr[],int x,int n,int index){
	
		for(int i=index;index<n-1;index++){
			
			arr[index]=arr[index+1];
		}
		return n-1;
	}
	
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6};
		int n=arr.length;
		int x=3;
		int num=deletion(arr,n,x);
		
		for(int i=0;i<num;i++){
			System.out.println(arr[i]);
		}
	}

}

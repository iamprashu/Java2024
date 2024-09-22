package G_Arrays;

public class LinearSearch {
    static void BinarySearch(int arr[],int Target){
        int start=0,end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid]==Target){
                System.out.println("Found At "+mid);
            }
            if(Target>arr[mid]){
                //go to right
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9,0};

        //applying Binary Search
        BinarySearch(array,7);
    }
}

//Q.2 Given an rotated sorted array of integer,and integer target,return index of target if it is in the array,otherwise return -1;
//arr -> {3,4,5,1,2}, target=4
//output -> 1

public class roteatedarr2 {
    static int printTargetInd(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid])
            return mid;

            if(arr[mid] < arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 4;

        System.out.println(printTargetInd(arr,target));
    }
}

//Q.2 Given an rotated sorted array of integer,and integer target,return index of target if it is in the array,otherwise return -1;
//arr -> {1,1,1,1,1,1,2,3,1,1}, target=2
//output -> true

public class roteatedarr3 {
    static boolean printTargetInd(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid])
            return true;
            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                ++start;
                --end;
            }
            else if(arr[mid] <= arr[end]){
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
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,1,1};
        int target = 2;

        System.out.println(printTargetInd(arr,target));
    }
}

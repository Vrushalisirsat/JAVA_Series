//Binary Search 
//Q.1 given an sorted array and a target element ,find the index of target element in an  if exists, othewise return -1.

class binSearch1{

    static int findIndex(int[] arr,int x)
    {
        int n = arr.length;
        int start = 0,end=n-1;

        while(start <= end)
        {
            int mid = (start + (end - start)/2);
            if(x == arr[mid]){
                return mid;
            } else if(x < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,10,13,15};
        int target = 13;

        System.out.println(findIndex(arr,target));
    }
}
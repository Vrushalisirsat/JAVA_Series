//Q. find the first occurances of a given element x, given that the given array is sorted.If no occurances of x is found then return -1.

public class firstOccEle {

    static int findInd(int[] arr,int x)
    {
        int n = arr.length;
        int start=0,end=n-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + (end - start)/2);

            if(arr[mid] == x){
                ans = mid;
                end = mid-1;
            }else if(x < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,6,6,8,9,9,9};
        int x = 12;

        System.out.println(findInd(arr,x));
    }
}

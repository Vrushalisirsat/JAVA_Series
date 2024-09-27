public class sqrt {
    static int findSqrt(int x){
        int start = 0,end = x;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            int val = mid*mid;

            if(val == x)
            {
                return mid;
            }else if(val < x){
                start = mid+1;
                ans = mid;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 49;

        System.out.println(findSqrt(x));
    }
}

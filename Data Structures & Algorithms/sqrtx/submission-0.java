class Solution {
    public int mySqrt(int x) {
        int l=0,r=x/2;
        int mid = 0;
        if (x<2) return x;
        while(l<=r){
            mid = (l+r)/2;
            long sq = (long) mid*mid;
            if(sq*sq==x)
                return mid;
                else if(sq>x)
                    r = mid-1;
                    else
                        l = mid + 1;
        }
        return r;
    }
}

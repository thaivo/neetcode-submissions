class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length == 1){
            if(piles[0] <= h)return 1;
            return piles[0]/h + (piles[0]%h!=0?1:0);
        }
       Arrays.sort(piles);
       int l = 1;
       int r = piles[piles.length -1];
       int res = r;
       while(l <= r){
        int k = (r + l)/2;
        long totalTime = 0;
        for(int p: piles){
            totalTime += Math.ceil((double)p/k);
        }

        
        if(totalTime <= h){
            res = k;
            r = k - 1;
        } else {
            l = k + 1;
        }
       }
       return res;
    }
}

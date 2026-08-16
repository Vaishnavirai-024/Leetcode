class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int left=0;
        int right=n;
        while(left<=right){
            int h=left+(right-left)/2;
            int count=0;
            for(int i:citations){
                if(i>=h){
                    count++;
                }
            }
            if(h<=count){
                left=h+1;
            }
            else{
                right=h-1;
            }
        }
        return right;
    }
}
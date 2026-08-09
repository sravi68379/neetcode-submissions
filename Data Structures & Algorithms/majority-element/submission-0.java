class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        if (n==1 || n==2) return nums[0];

        int fv=nums[0];
        int sv=nums[0];

        int fc=0;
        int sc=0;

        for (int num:nums){
            if (num==fv){
                fc++;
            }
            if (num==sv){
                sc++;
                if (sc>fc){
                    int temp=fv;
                    fv=sv;
                    sv=temp;

                    temp=fc;
                    fc=sc;
                    sc=temp;
                }
            }
            if (num!=fv && num!=sv){
                if (sc==0){
                    sv=num;
                    sc++;
                }else{
                    sc--;
                    fc--;
                }
            }
        }
        return fv;
    }
}
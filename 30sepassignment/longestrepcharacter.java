class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt=new int[26];
        int l=0,ans=0,maxf=0;

        for(int r=0;r<s.length();r++){
            cnt[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,cnt[s.charAt(r)-'A']);

            while(r-l+1-maxf>k){
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}

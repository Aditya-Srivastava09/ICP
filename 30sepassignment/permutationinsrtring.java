import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] cnt1=new int[26];
        int[] cnt2=new int[26];

        for(int i=0;i<s1.length();i++){
            cnt1[s1.charAt(i)-'a']++;
            cnt2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length()-s1.length();i++){
            if(matches(cnt1,cnt2)) return true;
            cnt2[s2.charAt(i+s1.length())-'a']++;
            cnt2[s2.charAt(i)-'a']--;
        }
        return matches(cnt1,cnt2);
    }

    private boolean matches(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}

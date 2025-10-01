import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()) return ans;

        int[] cntp=new int[26];
        int[] cnts=new int[26];

        for(int i=0;i<p.length();i++){
            cntp[p.charAt(i)-'a']++;
            cnts[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length()-p.length();i++){
            if(matches(cntp,cnts)) ans.add(i);
            cnts[s.charAt(i+p.length())-'a']++;
            cnts[s.charAt(i)-'a']--;
        }

        if(matches(cntp,cnts)) ans.add(s.length()-p.length());
        return ans;
    }

    private boolean matches(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}

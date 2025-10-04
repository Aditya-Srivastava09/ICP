import java.util.*;
class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int a=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(0,i,j,board,word)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static boolean dfs(int index,int r,int c,int []board,String word){
        int m=board.length;
        int n=board[0].length;
        if(r<0 || c<0 || r>m || c>n) return false;
        if(board[i][j]!=word[index]) return false;
        if(index==word.length()) return true;
    }
}

import java.util.*;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        int a=0;
        while(a<bills.length){
            if(bills[a]==5) five++;
            if(bills[a]==10){
                if(five>=1){
                five--;
                ten++;
                }
                else return false;

            }
            if(bills[a]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                  five-=3;
                } 
                else return false;
            }
            a++;
        }
        return true;
    }
}
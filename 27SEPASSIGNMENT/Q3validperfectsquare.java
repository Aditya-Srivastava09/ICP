import java.util.Scanner;

public class Q3validperfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
          if (num < 2) ;

        long low = 2, high = num / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sq = mid * mid;

            if (sq == num) System.out.println(true);
            else if (sq < num) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(false);
        sc.close();
    }
}

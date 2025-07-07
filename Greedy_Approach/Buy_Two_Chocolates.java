package Greedy_Approach;

import java.util.*;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();

        // Find two smallest prices
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int price : prices) {
            if(price < min1) {
                min2 = min1;
                min1 = price;
            } else if(price < min2) {
                min2 = price;
            }
        }

        int total = min1 + min2;
        if(total <= money) {
            System.out.println(money - total);
        } else {
            System.out.println(money);
        }
    }
}

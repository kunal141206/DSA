package Greedy;

import java.util.Arrays;

public class coinchange {
    public int minCoins(int coins[], int sum){
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            if (coins[i] <= sum) {
                while (coins[i] <= sum) {
                    count++;
                    sum -= coins[i];
                }
            }
        }
        if (count != 0) {
            return count;
        }
            return -1;
    }
}

package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */
public class NonDivisibleSubset {
    private static int nonDivisibleSubset(int[] array, int k) {
        int[] mods = new int[k];
        for (int i = 0; i < array.length; i++) {
            mods[array[i] % k]++;
        }
        int max = Math.min(mods[0], 1);
        for (int i = 1, j = mods.length - 1; i <= j; i++, j--) {
            if (i == j) {
                max += Math.min(mods[i], 1);
            } else {
                max += Math.max(mods[i], mods[j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(nonDivisibleSubset(array, k));
    }
}

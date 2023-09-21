import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NotContains {
    public static void main(String[] args) {
        //after this min is founded in array
        //now find min number after founded number which is not in array
        //Solution 1 - Sort then find -
        //Solution 2 - Brute Force Solution - check all possible founded+1 in array --
        int[] arr={1,2,10,6,4,3,5,9,123,4};
        System.out.println(notContains(arr));
    }
    static int notContains(int[] arr){
        Set<Integer> set = new HashSet<>();

        // Add all positive integers in the array to the HashSet
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Start from 1 and check if each positive integer is in the HashSet
        int minPositive = 1;
        while (set.contains(minPositive)) {
            minPositive++;
        }

        return minPositive;

    }


}

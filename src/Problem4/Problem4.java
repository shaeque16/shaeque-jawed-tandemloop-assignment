package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        /*Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
        (examples)
                input: [1,2,8,9,12,46,76,82,15,20,30]
        Output:
        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/


        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] input =  {1,2,8,9,12,46,76,82,15,20,30};

        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i : arr ) {
            int count=0;

            for(int num : input){
                if(num % i == 0){
                    count++;
                }
            }

            res.put(i,count);
        }

        System.out.println(res);
    }
}

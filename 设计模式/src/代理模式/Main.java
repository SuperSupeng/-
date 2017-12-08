package 代理模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Main {
    public static void main(String[] args){
//        SchoolGirl girl = new SchoolGirl();
//        girl.setName("小博");
//
//        Proxy proxy = new Proxy(girl);
//
//        proxy.giveDolls();
//        proxy.giveChocolate();
//        proxy.giveFlowers();
        int[] a = twoSum(new int[]{2,5,5,11}, 10);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

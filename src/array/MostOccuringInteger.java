package array;

import java.util.HashMap;
import java.util.Map;

public class MostOccuringInteger {

//    Method 1:
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 4, 5, 3, 2, 1, 6, 7, 1, 2, 2, 3};
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int arrNum = 0; arrNum < arr.length; ++arrNum) {
//            if (map.containsKey(arr[arrNum])) {
//                map.put(arr[arrNum], map.get(arr[arrNum]) + 1);
//            } else {
//                map.put(arr[arrNum], 1);
//            }
//        }
//        int mostOccuringInteger = arr[0];
//        int maxCount = 0;
//        Set<Map.Entry<Integer, Integer>> entrySet =  map.entrySet();
//        for(Map.Entry<Integer, Integer> mapItrKey: entrySet){
//            if(mapItrKey.getValue() > maxCount){
//                maxCount = mapItrKey.getValue();
//                // jiski number ki value or occurrence sabse jayda rahegi, that number is going to be most repeating character.
//                mostOccuringInteger = mapItrKey.getKey();
//            }
//        }
//        System.out.println("MostOccuringInteger: " + mostOccuringInteger + " " +"Occurrence: " + maxCount);
//    }

    //    Method 2:
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 3, 2, 1, 6, 7, 1, 2, 2, 3};

        // Create a HashMap to store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int arrNum = 0; arrNum < arr.length; ++arrNum) {
            map.put(arr[arrNum], map.getOrDefault(arr[arrNum], 0) + 1);
        }
//          for (int num : arr) {
//              map.put(num, map.getOrDefault(num, 0) + 1);
//          }

        int mostOccurring = arr[0];
        int maxCount = 0;

        // Find the element with the highest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostOccurring = entry.getKey();
            }
        }
        System.out.println("Most occurring integer: " + mostOccurring);
        System.out.println("Occurrences: " + maxCount);
    }

}

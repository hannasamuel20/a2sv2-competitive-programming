package contest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
class ForContest {
    public static void main(String[] args) {
        int[] arr = longest("ddaaabbbaaaabbb");
        for (int n:arr) {
            System.out.println(n);
        }
    }
    public static  int[] longest(String word){
        int[] result = new int[2];
        char char1 = ' ';
        char char2 = ' ';
        char curr = word.charAt(0);
        int consecutive = 0;
        int count = 0;
        int maxCount  = 0;
        int startIndex = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (char1 == ' ') {
                count++;
                char1 = word.charAt(i);
            } else if (char2 == ' ' && char1 != word.charAt(i)) {
                char2 = word.charAt(i);
                count++;
            } else if (char1 == word.charAt(i) || char2 == word.charAt(i)) {
                if (word.charAt(i) == curr) {
                    consecutive++;
                } else {
                    consecutive = 1;
                    curr = word.charAt(i);
                }
                count++;
            } else {
                if (count > maxCount) {
                    result[0] = startIndex;
                    maxCount = count;
                    result[1] = maxCount;
                }
                startIndex = i;
                char1 = word.charAt(i);
                char2 = curr;
                curr = word.charAt(i);
                count = consecutive;
                count++;
            }

        }
        if (count > maxCount) {
            result[0] = startIndex;
            maxCount = count;
            result[1] = maxCount;
        }
        return result;
    }

}
package weekNine_slidingWindow;

public class GetEqualSubstrings {
    public int equalSubstring(String s, String t, int maxCost) {
        int count = 0;
        int i = 0;
        int total = 0;
        int first = 0;

        while(i<s.length()) {
            int diff = Math.abs(s.charAt(i) - t.charAt(i));
            if (total + diff <= maxCost) {
                count++;
            } else {
                total -= Math.abs(s.charAt(first) - t.charAt(first));
                first++;
            }
            total += diff;
            i++;
        }
        return count;
    }
}

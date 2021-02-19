package contest;

public class MatchingStrings {
    public static void main(String[] args) {
        for (int i: matchingStrings(new String[]{"ab"," ab","abc"},new String[]{"ab","abc","bc"})) {
            System.out.println(i);
        }

    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int [] array = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count=0;
            for (int j = 0; j <strings.length ; j++) {
                if(queries[i].equals(strings[j])){
                    count++;
                }
                
            }
            array[i]=count;
        }

      return array;



    }
}

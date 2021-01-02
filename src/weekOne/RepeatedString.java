package weekOne;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count=0;
        int index=0;
        int length=s.length();
        while(index<s.length()){
            if(s.charAt(index)=='a'){
                count++;
            }
            index++;
        }


        long secondLength=n%length;
        int secondIndex=0;
        int secondCount=0;
        while(secondIndex<secondLength){
            if(s.charAt(secondIndex)=='a'){
                secondCount++;
            }
            secondIndex++;
        }

        return (((n/length)*count)+secondCount);

    }

}

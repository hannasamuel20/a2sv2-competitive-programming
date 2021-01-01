public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(10,"DUDDDUUDUU"));
    }
    public static int countingValleys(int steps, String path) {
        int step = 0;
        boolean enteredAvalley=false;
        int valley = 0;
        for (int i = 0; i <path.length() ; i++) {

            if(path.charAt(i)=='D'){
                step--;
            }
            else if(path.charAt(i)=='U'){
                step++;
            }
            if(step<=-1){
                enteredAvalley=true;
            }
            if(enteredAvalley&&step==0){
                enteredAvalley=false;
                valley++;
            }

        }
        return valley;
            }


}

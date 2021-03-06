package dailyQuestions;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int first = 0;
        int last = height.length-1;
        int left = height[0];
        int right = height[last];
        int i = first;
        int j = last;
        int max = 0;


        if(right<left){
            max = right * (j-i);
        }
        else{
            max = left * (j-i);
        }


        while(first<last){

            if(height[first]<height[last]){
                left = height[first];
                while(first<last){
                    if(height[first]>left){
                        i=first;
                        left = height[first];
                        break;
                    }
                    first++;

                }
            }
            else{
                right = height[last];
                while(first<last){
                    if(height[last]>right){
                        j=last;
                        right = height[last];
                        break;
                    }
                    last--;

                }


            }
            int area = 0;
            if(right<left){
                area = right * (j-i);
            }
            else{
                area = left * (j-i);
            }

            if(area>max){
                max=area;
            }


        }


        return max;

    }




//brute force approach
     public int maxArea2(int[] height) {
         int max = 0;

         for(int i=0;i<height.length-1;i++){
             for(int j=i+1;j<height.length;j++){
                 int minHeight =height[i];
                 if(height[j]<height[i]){
                     minHeight=height[j];
                 }
                 int area = minHeight * (j-i);
                 if(area>max){
                     max=area;
                 }

             }
         }
         return max;

     }

}

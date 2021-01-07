package weekTwo;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        for (int item:intersection(new int[]{1,2,2,1},new int[]{2,2})) {
            System.out.println(item);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        if(nums1.length==0||nums2.length==0){
            return new int[]{};
        }
        else{
            int max1 = nums1[0];
            for (int num1:nums1) {
                if(num1>max1){
                    max1=num1;
                }
            }
            int max2 = nums2[0];
            for (int num2:nums2) {
                if(num2>max2){
                    max2=num2;
                }
            }

            int [] countArray1 = new int[max1+1];
            int [] countArray2 = new int[max2+1];

            for (int i = 0; i <nums1.length ; i++) {
                countArray1[nums1[i]]= ++countArray1[nums1[i]];
            }
            for (int i = 0; i <nums2.length ; i++) {
                countArray2[nums2[i]]= ++countArray2[nums2[i]];
            }
            int minArrayLength = countArray1.length>countArray2.length?countArray2.length:countArray1.length;
            ArrayList<Integer> holder= new ArrayList<>(0);

            for (int i = 0; i <minArrayLength ; i++) {
                if(countArray1[i]>0&&countArray2[i]>0){
                    holder.add(i);
                }
            }
            int [] finalArray = new int[holder.size()];
            for (int i = 0; i <holder.size(); i++) {
                finalArray[i]=holder.get(i);
            }

            return finalArray;

        }

    }
}

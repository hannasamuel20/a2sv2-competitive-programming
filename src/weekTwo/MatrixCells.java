package weekTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class MatrixCells {
    public static void main(String[] args) {
        for (int [] s:allCellsDistOrder(2,3,1,2)) {
            System.out.println(s[0]+","+s[1]);
        }

    }

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int [] differences=new int[R*C];
        int [][]sorted=new int[R*C][2];
        int k=0;
        for (int i = 0; i <R ; i++) {
            for (int j = 0; j <C ; j++) {
                differences[k]=Math.abs(r0-i)+Math.abs(c0-j);
                sorted[k]=new int[]{i,j};
                k++;

            }
        }
        for (int i = 0; i <differences.length-1 ; i++) {
            for (int j = i+1; j <differences.length ; j++) {
                if(differences[i]>differences[j]){
                    int tempval=differences[i];
                    differences[i]=differences[j];
                    differences[j]=tempval;

                    int [] temp = sorted[i];
                    sorted[i]=sorted[j];
                    sorted[j]=temp;
                }
            }
        }

        return sorted;

    }
}

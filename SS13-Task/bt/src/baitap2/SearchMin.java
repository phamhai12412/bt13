package baitap2;

import java.util.Arrays;

public class SearchMin {
    public static void main(String[] args) {
        int arrList[] = getArr();
        System.out.println(Arrays.toString(arrList));
        int min=arrList[0];
        for (int i = 0;i < arrList.length;i++){

            if(arrList[i]<min){
                min=arrList[i];
            }

        }
        System.out.println(min);
    }


    private static int[] getArr(){
        int arr[]=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        return arr;
    }
}

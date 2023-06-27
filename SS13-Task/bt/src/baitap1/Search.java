package baitap1;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {
        int arrList[] = getArr();
        System.out.println(Arrays.toString(arrList));
        int max=arrList[0];
        for (int i = 0;i < arrList.length;i++){

            if(arrList[i]>max){
                max=arrList[i];
            }

        }
        System.out.println(max);
    }


    private static int[] getArr(){
        int arr[]=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        return arr;
    }
}

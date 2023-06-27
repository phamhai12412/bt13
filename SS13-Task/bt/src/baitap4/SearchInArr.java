package baitap4;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
       boolean found = false;
        for(int i = 0; i < size; i++) {
            if(num == arr[i]){
                found = true;
                System.out.println("Tim thay " + num + "tai vi tri " + i);
                break;

            }

        }
        if(!found){
            System.out.println("khong tim thay");

        }
    }

}



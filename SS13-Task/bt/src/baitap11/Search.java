package baitap11;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu trong mang");
        String numberLists = sc.nextLine();
        String[] newList =  numberLists.split(" ");
        System.out.println("nhap so can tim");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(newList));
        int found = -1;
        for(int i = 0; i < numberLists.length(); i++){
            if(Integer.parseInt(newList[i]) == num){
                found = i;
                System.out.println("tim thay "+ num + " tai vi tri " + found);
                break;
            }

        }


        if(found == -1){
            System.out.println("Khong tim thay");

        }

    }
}


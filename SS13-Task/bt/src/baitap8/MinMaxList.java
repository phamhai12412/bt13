package baitap8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinMaxList {
    public static void main(String[] args) {
        int[] arr= getArr();
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap min");

        int min = Integer.parseInt(sc.nextLine());
        System.out.println("nhap max");

        int max = Integer.parseInt(sc.nextLine());

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=min&&arr[i]<=max) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
    private static int[]getArr(){
        int arr[]=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        return arr;
    }
 }

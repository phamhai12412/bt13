package baitap14;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi theo thu tu tang dan");
        String nums = sc.nextLine();
        String[] arr = nums.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập số cần tìm:");
        int num = sc.nextInt();
        System.out.println(binarySearch(arr, num));
    }

    private static int binarySearch(String[] arr,int value) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if(Integer.parseInt(arr[mid])==value){
                return mid;
            }else if(Integer.parseInt(arr[mid])>value) {
                left = mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}

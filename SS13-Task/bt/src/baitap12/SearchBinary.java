package baitap12;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các phần tử trong mảng:");
        String numberLists = sc.nextLine();
        String[] newList = numberLists.split(" ");
        System.out.println("Nhập số cần tìm:");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(newList));
        if(binarySearch(newList, num)==-1){
            System.out.println("Khong tim thay");
        }
        else {
            System.out.println("tim thay so tai vi tri " + binarySearch(newList, num));
        }
    }

    public static int binarySearch(String[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (Integer.parseInt(list[mid]) > key) {
                high = mid - 1;
            } else if (key == Integer.parseInt(list[mid])) {
                return mid;
            } else if (key < Integer.parseInt(list[mid])) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

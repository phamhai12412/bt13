package baitap10;

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        Integer[] arr= getArr();
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap min");

        int min = Integer.parseInt(sc.nextLine());
        System.out.println("nhap max");
        int max = Integer.parseInt(sc.nextLine());
        binarySearch(arr,list,min,max);
        System.out.println(list);
        int foundMax=-1;
        int foundMin=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==list.get(0)){
                foundMax = i;
            } else if (arr[i]==list.get(list.size()-1)){
           {      foundMin = i;

            }
        }

        }
        System.out.println("so lon gan nhat la "+ list.get(0) + " tai vi tri thu "+ foundMax);
        System.out.println("so be gan nhat la "+ list.get(list.size()-1) + " tai vi tri thu "+ foundMin);
    }
    private static Integer[]getArr(){
        Integer arr[]=new Integer[20];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
    public static int binarySearch(Integer arr[],List<Integer> list, int low, int high) {
        if (high >= low) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > low && arr[i] < high)
                    list.add(arr[i]);
            }
        }
        return -1;
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Hung");
        list.add("Hung2");
        list.add("Hung3");
        list.add("Hung4");
        list.add("Hung5");
        System.out.println(list.indexOf("Hung"));
        System.out.println(list.indexOf("Hung6"));
    }
    //de quy
    int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }
    //ko de quy
    public static int binarySearch( int[] list,int key){
    int low = 0;
    int high = list.length-1;
    while (low >= high){
        int mid = (high+low)/2;
        if (list[mid]>key){
high=mid-1;
        }
        else if(key == list[mid]){
            return mid;
        }
        else low=mid+1;
    }
    return -1;
    }
}
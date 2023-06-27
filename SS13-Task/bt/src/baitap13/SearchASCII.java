package baitap13;

import java.util.*;

public class SearchASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();

        List<String> strings = new ArrayList<>(Arrays.asList(str.replaceAll("\\s", "").split("")));

        Set<String> uniqueStrings = new TreeSet<>(strings);
        System.out.println(strings);
        System.out.println(uniqueStrings);
    }
}

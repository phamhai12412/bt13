package baitap7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        for(int i=0;i<words.length;i++) {
            string.add(words[i]);
        }
        System.out.println("nhap tu can tim");
        String key = scanner.nextLine();
        boolean found = false;
        for(int i=0;i<string.size();i++) {
            if(string.get(i).equals(key)) {
                System.out.println("tim thay " + key + " tai vi tri " + i);
                found = true;


            }
        }
        if(!found){
            System.out.println("khong tim thay");
        }



    }
}

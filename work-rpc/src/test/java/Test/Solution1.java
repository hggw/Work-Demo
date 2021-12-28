package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        run();
    }
    public static String run() {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] data = new String[n];
        int i = 0;
        while(i < n && in.hasNext()) {
            data[i] = in.nextLine();
            i++;
        }
        String[][] data1 = new String[n][4];
        int j = 0;
        for(String str : data) {
            data1[j++] = str.split(" ");
        }
        Arrays.sort(data1,(o1, o2) -> {
            if(o1[3] != o2[3]) {
                return o1[3].compareTo(o2[3]);
            }
            if(o1[2] != o2[2]) return o1[2].compareTo(o2[2]);
            if(o1[1] != o2[1]) return o1[1].compareTo(o2[1]);
            return o1[0].compareTo(o2[0]);
        });
        StringBuilder res = new StringBuilder();
        for(String str : data) {
            res.append(str).append("\r\n");
        }
        System.out.println(res.toString());
        return res.toString();
    }
}

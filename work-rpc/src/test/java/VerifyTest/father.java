package VerifyTest;

import java.net.PortUnreachableException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class father {
    String age;
    String name;
    String ID;
    public father(String age,String name,String ID) {
        this.age = age;
        this.name = name;
        this.ID = ID;
    }
    public void run(int x , int y) {
        try{
            System.out.println(x/y);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("这是自己抛出的异常");
        }

    }

    public static void main(String[] args) {
        String str = "abcabcdabc";
        int[] res = getNext(str);
    }

    public static int[] getNext(String t) {
        int[] next = new int[t.length()];
        next[0] = -1;
        int j = 0, k = -1;
        while(j < t.length() - 1) {
            if(k == -1 || t.charAt(j) == t.charAt(k)) {
                next[j++] = k++;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}

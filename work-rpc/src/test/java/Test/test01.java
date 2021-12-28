package Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test01 {
    public static void main(String[] args) throws ParseException {
        String a = "aa&&bb&&cc";
        String[] data = a.split("&&");
        System.out.println(data);
        }
}

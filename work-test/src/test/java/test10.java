import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test10 {
/*    public static void main(String[] args) {
        String x = new String("a")+new String("b");
        //String y = x.intern();
        System.out.println(x=="ab");
        //System.out.println(y=="ab");
    }*/
    public static void main(String[] args) {
        String one = "a";
        List<String> temp = new ArrayList<>();
        test10.run(temp);
        System.out.println(temp);



    }
     public static void run(List<String> one){
        one.add("123");
    }
}

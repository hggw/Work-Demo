import java.math.BigDecimal;
import java.util.*;

/**
 * String s7 = new String("1")+new String("1");//常量池中并没有生成”11“
 * String s8=s7.intern();
 * jdk7之后，在常量池中并没有生成”11“，调用intern()方法后，会将堆空间中已经生成的”11“对象的地址复制一份到常量池
 * jdk7之前，是直接把对象复制过去
 */
public class test01 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1+s2;//这里调用的StringBuilder,再用append添加进去，最后用toString()
        final String s5 = "a";
        final String s6 = "b";
        String s7 = new String("1")+new String("1");//常量池中并没有生成”11“
        //String s8=s7.intern();
        String s9 = "11";//往常量池中生成了一个”11“
        //String s8=s7.intern();;//没做啥事情

        System.out.println(s7==s9);
/*        System.out.println(s8==s9);
        System.out.println(s8==s7);*/
    }

}

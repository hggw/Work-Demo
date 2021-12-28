package VerifyTest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {
        One one = new One();
        List<Two> twoList = new ArrayList<>();
        Two two = new Two("name","huang");
        twoList.add(two);
        one.setTwoList(twoList);
        Map<String,String> res = new HashMap<>();
        cmpValue(one.getTwoList(),res);


    }
    public static void cmpValue(Object object,Map<String,String> res) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field field : fields) {
            Object itemValue = getFieldValue(object,field);
            if(itemValue != null) {
                res.put(field.getName(),itemValue.toString());
            }
        }
    }
    public static Object getFieldValue(Object object,Field field) throws Exception {
        try{
            field.setAccessible(true);
            return field.get(object);
        } catch (Exception e) {
            System.out.println("反射获取属性值失败");
            throw new Exception();
        }
    }
}


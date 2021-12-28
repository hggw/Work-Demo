package ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author HGW
 */
public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDaoImpl));
        int result = dao.add(1,2);
        System.out.println(result);
    }
}
class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法之前执行....."+ method.getName() +':' + Arrays.toString(args));

        Object res = method.invoke(obj,args);

        System.out.println("方法之后执行....."+ obj);
        return res;
    }
}
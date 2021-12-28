import java.lang.ref.SoftReference;

public class SoftReferenceTest {
    public static class User{
        public User(int id,String name){
            this.id = id;
            this.name = name;
        }
        public int id;
        public String name;

        @Override
        public String toString() {
            return "[id="+ id + ", name=" + name + ']';
        }
    }
    public static void main(String[] args) {
        SoftReference<User> userSoftReference = new SoftReference<User>(new User(1,"huanggw"));
        System.out.println(userSoftReference.get());
        System.gc();
        System.out.println("After GC");
        System.out.println(userSoftReference.get());
        try{
            byte[] b = new byte[1024*1024*7];
        } catch (Throwable e) {
            e.printStackTrace();
        }finally {
            System.out.println(userSoftReference.get());
        }
    }
}

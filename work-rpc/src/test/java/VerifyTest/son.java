package VerifyTest;

public class son extends father {

    public son(String age, String name, String ID) {
        super(age, name, ID);
    }
    public void run1(int x , int y) {
        try {
            super.run(x,y);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

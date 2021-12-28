package VerifyTest;

abstract class father1 {
    protected String str;
    public void run() {
        this.str.substring(0,1);
    }
}
class son1 extends father1 {
    public void run1() {
        str.substring(1,2);
    }

    public son1( String str1) {
        this.str = str1;
    }
}

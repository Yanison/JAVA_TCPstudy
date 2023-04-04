package kr.study;

import kr.A;
import kr.B;

public class TPC_29 {
    public static void main(String[] args) {
        Object a = new A();
        display(a);
        Object b = new B();
        display(b);


    }
    public static void display(Object o){
        if(o instanceof A){
            ((A)o).go();

        }else {
            ((B)o).go();
        }
    }
}

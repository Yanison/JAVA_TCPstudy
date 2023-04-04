package kr.study;

import kr.A;
import kr.B;

public class TPC_30 {
    public static void main(String[] args) {
        /**
         * A와 B의 클래스를 저장할 배열을 만들어라
         */

        Object[] o = new Object[2];
        o[0] = new A();
        o[1] = new B();

        for (int i = 0; i < o.length; i++) {
            if(o[i] instanceof A){
                ((A)o[i]).go();

            }else {
                ((A)o[i]).go();
            }
        }
    }
}

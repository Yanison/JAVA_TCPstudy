package kr.study;

import kr.tpc.Overload;

public class TCP_16 {
    /**
     * Overloading 정적 바인딩이다.
     * 메소드 호출시점에서 호출될 메소드가 이미 정해져있기 때문에 속도와 상관없다. 
     */
    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.hap(20,50);
        ov.hap(23.4f,22);
        ov.hap(23.4f,23.4f);
    }

}

package kr.study;

import kr.A;

public class TPC_28 {
    /**
     * Object 클래스의 toString은 메모리 번지수를 문자열 반환하는 메소드이다.
     */
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a); // toString이 재정의 되어있기 때문에 "재정의된 A입니다" 라고 뜸
        // 재정의를 하지 않으면 메모리 번지수가 문자열로 표시가 된다.

        Object o = new A(); //upcasting
        ((A)o).display();
        System.out.println(o.toString()); // 재정의된 toString이 실행이된다.
    }
}


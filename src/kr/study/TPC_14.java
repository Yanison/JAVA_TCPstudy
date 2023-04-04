package kr.study;

import kr.tpc.MemberVO;

public class TPC_14 {
    public static void main(String[] args) {
//        MemberVO m = new MemberVO();
//        m.name = "홍길동";
//        m.age=50;
//        m.tel ="010-1111-1111";
//        m.addr = "서울";
//
//        System.out.println(m.name);
//        System.out.println(m.age);
//        System.out.println(m.tel);
//        System.out.println(m.addr);
        /**
         * 위의 예시처럼 Memeber의 필드에 직접적으로 접근이 가능
         * 잘못된 값을 넣을수도 있다
         */

        MemberVO m2 = new MemberVO();
        m2.setName("홍길동");
        m2.setAge(50);
        m2.setTel("01031744295");
        m2.setAddr("Seoul");

        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getTel());
        System.out.println(m2.getAddr());
    }
}

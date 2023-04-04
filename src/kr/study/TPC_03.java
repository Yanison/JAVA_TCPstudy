package kr.study;

import kr.bit.Book;
import kr.bit.PersonVO;

/**
 * 관계를 이해하라 (V.D.A)
 */
public class TPC_03 {
    public static  void main(String[] args){
        /*
         PDT VS UDDT
         */
        int a; // a라는 변수의 메모리 빈 메모리 공간을 생성
        a= 10;  // a 메모리 공간에 10이라는 데이터 할당

        // 책 1권을 저장하기 위한 변수를 선언하시오
        //Book b;
        /**
         * 보통 책 이라 하면 여러가지 정보가 담겨져있다.
         * 책의 분량, 제목,출판사 등등..
         * 컴퓨터의 언어에서는 책이란 단어 하나로는 책을 정의할 수 없다.
         *
         * 책의 분량의 정보를 담을 메모리 공간
         * 책의 재목 정보를 담을 메모리 공간
         * 책의 출판사를 담을 메모리 공간 등등
         * 여러 메모리 공간들이 집합으 이루어 책을 정의하게된다.
         *
         * 이런 메모리 공간을 설계,정의하고 나열한 집합체,
         * 혹은 객체를 class라고 정의한다.
         */

        Book b;
        b = new Book();
        /**
         * b라는 메모리 공간에 우리가 설계한대로 Book 자료구조를 할당한다는 것.
         * 이 아니라 메모리 어딘가에 설계한 Book의 자료구조를 생성한다는 것이다.
         *
         * 메모리 공간 하나에 객체를 집어넣는 느낌은 아니다.
         */

        b.title = "자바책";
        b.price = 15000;
        b.company = "한빛미디어";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);

        PersonVO p;
        p = new PersonVO();
        p.name = "박메일";
        p.age = 40;
        p.weight = 68.4f;
        p.height = 174.7f;

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.height);

        /**
         * 메모리를 나란히 나열된 점에서 배열과 클래스의 차이는 무엇일까?
         */
    }
}

package kr.bit;

/**
 * 책(객체)을 설계하기 위한 필요 내용들
 * 제목,가격,출판사,페이지수... (상태정보) + (행위정보 :: 동장 == 메소드)
 */
public class Book {
    public String title;
    public int price;
    public String company;
    public int page;
}

/**
 * 위 처럼 객체를 설계하고 생성하면 메모리에 객체가 올려지는데
 * 이 과정을 객체를 생성한다 라고 표현한다.
 *
 * 그리고 이 Book이라는 객체는 사용자 정의 자료형이다.
 */
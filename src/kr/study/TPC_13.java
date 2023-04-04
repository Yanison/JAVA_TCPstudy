package kr.study;

import kr.tpc.BookDTO;

public class TPC_13 {
    public static void main(String[] args) {
        /**
         * 책 -> class(BookDTO) -> 객체 -> 인스턴스
         */
        String title = "스프링";
        int price = 25000;
        String company = "제이펍";
        int page = 890;

        BookDTO dto;// dto -> 실체가 없다, object 이다.
        dto = new BookDTO(title,page,price,company); // dto는 가리키는 실체가 있기 때문에 instance이다.

        bookPrint(dto);
    }
    public static void bookPrint(BookDTO book){
        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.page);
        System.out.println(book.company);
    }

}

package kr.study;

import kr.tpc.BookVO;

public class TPC_12 {
    public static void main(String[] args) {
        /**
         * 생성자 중복정의 가능
         */

        BookVO b = new BookVO();
        String a = b.company;
        System.out.println(b.company);
    }
}

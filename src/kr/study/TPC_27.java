package kr.study;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC_27 {
    public static void main(String[] args) {
        /**
         * RemoCon으로 TV클래스를 구현하시고
         */

        RemoCon r = new TV();
        for (int i = 0; i < 100; i++) {
            r.chUp();
        }
        for (int i = 0; i < 100; i++) {
            r.chDown();
        }

        r.internet();

        r = new Radio();
        r.chUp();
        r.chUp();
        r.internet();
    }
}

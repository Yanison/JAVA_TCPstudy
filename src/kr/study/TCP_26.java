package kr.study;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TCP_26 {
    public static void main(String[] args) {

        RemoCon r = new TV();
        r.chDown();

        r = new Radio();
    }
}

package kr.study;

import kr.tpc.BookDTO;
import kr.tpc.Inflearn;

import java.util.ArrayList;
import java.util.List;


/**
 *  객체생성에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생성할 수 없다는 뜻
 *  그러므로 객체를 생성하지 않고도 사용가능 해야 된다.(모든 클래스의 멤버가 static 멤버가 되어야 한다.)
 */
public class TPC_31 {
    public static void main(String[] args) {
        /**
         * Inflearn ifn = new Inflearn();
         * -> Inflearn()' has private access in 'kr.tpc.Inflearn'
         */

        Inflearn.tpc();
        Inflearn.java(); //static 메소드는 new 안쓰고 바로 접근 가능

        List<BookDTO> list = new ArrayList<>();
    }
}

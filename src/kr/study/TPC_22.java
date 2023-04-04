package kr.study;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC_22 {
    public static void main(String[] args) {

        Animal ani = new Cat();
        Object obj = new Cat();// Object는 객체의 최상위 클래스
        ani.eat(); // 컴파일 시점 -> animal.eat()

        /**
         * 다운 캐스팅을 하는 두가지 방법
         */
        ((Cat)ani).night(); // 1
        Cat c = (Cat)ani;// 2
        c.night();

        ani = new Dog();
        ani.eat();
        obj = new Dog();
        ((Dog)obj).eat();
        /**
         * 다형성
         * 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
         */

    }
}

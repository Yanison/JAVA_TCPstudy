package kr.study;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC_20 {
    public static void main(String[] args) {

        Dog d = new Dog(); // upcasting
        d.eat();
        Cat c = new Cat();
        c.eat();

        /**
         * 만약 다른 사람이 Dog와 Cat class 파일만 준다면
         * 구현체에 어떤 기능이 있는지 모르기 때문에 부모객체를 써서 Dog,Cat을 생성하는게 좋다.
         *
         * Dog를 몰라도 Animal을 알면 구현할 수 있다.
         */
        Animal ad = new Dog();
        ad.eat();
        Animal ac = new Cat();
        ac.eat();
        /**
         * Animal에는 정의되지 않은 cat의 night는 어떻게 구현할까?
         * -> downcasting
         */
        ((Cat)ac).night();
    }
}

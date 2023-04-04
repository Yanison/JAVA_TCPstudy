package kr.study;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC_23 {
    public static void main(String[] args) {
        /**
         * 1. 다형성 인수
         */
        Dog d= new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }
    public static void display(Animal a){
        a.eat();
        if(a instanceof Cat){
            /**
             * night()는 Cat의 메소드이기 때문에 display(d)에서 오류가 날 수 밖에 없다.
             */
            ((Cat)a).night();// downcasting
        }
    }
}

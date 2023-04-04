package kr.study;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC_24 {
    public static void main(String[] args) {
        /**
         * 2. 다형성 배열
         * Dog,Cat 저장할 배열을 생성하시오
         */
        Animal[] a = new Animal[2];
        a[0] = new Dog();
        a[1] = new Cat();

        display(a);
    }

    public static void display(Animal[] a){
        for (int i = 0; i < a.length; i++) {
            a[i].eat();
        }
    }
}

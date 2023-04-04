package kr.study;

import kr.poly.*;

public class TCP_25 {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}

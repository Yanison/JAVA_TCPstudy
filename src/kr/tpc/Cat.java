package kr.tpc;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("고양이 같이 먹다.");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이 난다");
    }
}

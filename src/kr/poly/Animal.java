package kr.poly;

/**
 * 추상클래스(불완전한 객체) -> Animal ani = new Animal();
 */
public abstract class Animal{
    public abstract void eat(); // 추상메서드
    public void move(){
        System.out.println("무리를 지어서 움직인다.");
    };
}

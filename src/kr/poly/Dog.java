package kr.poly;

public class Dog extends Animal {
    /**
     * 이름,나이,종 : 객체의 상태정보
     */
    @Override // 부모의 추상 메소드를 제정의
    public void eat() {
        System.out.println("개같이 먹다");
    }

    public Dog(){
        super();// new Animal(); 생략됨
    }
}

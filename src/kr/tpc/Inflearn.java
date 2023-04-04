package kr.tpc;

public class Inflearn {
    private Inflearn(){
        //클래스 내부 모든 메소드가 static이면 객체생성을 할 이유가 없다. private으로 객체 생성을 막아도 됨.
    }
    //인스턴 메소드
    public static void tpc(){
        System.out.println("tpc 강의 너무 재미있어요");
    }
    //클래스메소드
    public static void java(){
        System.out.println("java 강의 너무 재미있어요");
    }
}

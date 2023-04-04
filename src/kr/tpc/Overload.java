package kr.tpc;

public class Overload {
    /**
     * 동작으로만 이루어진 객체
     */
    public void hap(int a, int b){
        System.out.println(a+b);
    }

    public void hap(float a, int b){
        System.out.println(a+b);
    }

    public void hap(float a, float b){
        System.out.println(a+b);
    }
    /**
     * 메소드 이름은 같지만 매개변수가 다르다.
     * 컴파일 시점에서 컴퓨터는 같은 메소드 이름이어도 매개변수에 따라서
     * 각기 다르게 이름을 저장한다.
     */
}

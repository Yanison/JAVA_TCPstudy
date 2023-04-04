import java.awt.print.Book;

public class TPC_02 {
    public static void main(String[] args) {
        /**
         * java 프로그래밍의 3대 요소 : 변수, 자료형(DataType),할당(=)
         * 1+1=2라는 연산을 어떻게 프로그래밍 할까?
         *
         * 메모리(RAM)에서 계산이 된다.
         * 메모리에서 연산이 되려면 연산할 자료를 기억할 데이터 공간이 필요하다.
         * 이때 자료를 저장할때
         * 1.자료의 크기와
         * 2.자료의 타입
         * 이라는 두가지 정보가 저장이 된다.
         */
        int a,b,c;
        /**
         * 위 처럼 int 타입 변수 a,b,c가 선언되어졌다 -> 메모리에 기억이 된다.
         * 지금 a,b,c를 기억하는 공간 3개가 생성이 되었다.
         *
         * DataType + Varibale 변수가 선언이 되면 ST(변수 테이블)이 등록이 된다.
         * ST :: Symbol Table(변수목록표)
         * 변수가 기억공간을 할당 받으면 변수의 번지가 등록되는 테이블
         */

        a = 1;
        b = 1;
        c = a+b;

        float f;
        f  =34.5f;
        System.out.println(f);
        char d;
        d ='d'; // char타입은 '' 싱글따옴표로 감싸서 표현한다.
        String s;
        s = "string";

        Book bk;
    }
}

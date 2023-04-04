package kr;
import java.lang.*;

public class A extends Object{
    public A(){
        super();
    }

    public void display(){
        System.out.println("A 입니다.");
    }
    public static void go(){
        System.out.println("A의 go 메소드 입니다.");
    }
    @Override
    public String toString(){
        return "재정의된 A입니다.";
    }
}

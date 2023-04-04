package kr.tpc;

public class Animal extends Object {
    public void eat() {
        System.out.println("?");
    }
    public Animal(){
        super(); // new Object(); 생략됨.
    }
}

package kr.study;

public class TPC_09 {

    public static void main(String[] args) {
        int a= 56;
        int b= 40;
        TPC_09 tpc = new TPC_09();// 객체를 메모리에 강제로 올린다.
        int v = tpc.sum(a,b);
    }

    public int sum(int a, int b){
        int v = a+b;
        return v;
    }
}

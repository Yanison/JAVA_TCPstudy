package kr.study;

/**
 *  1. 실행
 */
public class TPC_08 {
    public static void main(String[] args) {
        int a = 10,b = 20;
        TPC_08 tpc = new TPC_08();
        int v = tpc.noneStaticMethod(a,b);
        System.out.println(v);
    }
    public static int add(int a, int b){
        int sum = a+ b;
        return sum;
    }
    public int noneStaticMethod(int a, int b){
        int sum = a+ b;
        return sum;
    }
}

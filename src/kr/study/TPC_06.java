package kr.study;

public class TPC_06 {
    public static void main(String[] args) {
        // 5. 메서드 -> 동작 (method), 기능(function)
        int a = 67;
        int b = 98;

        int result = sum(a,b);
    }
    /**
     * 정수 2개를 매게변수로 받아서 더하여 총 합을 리턴하는 메서드를 정의하시오.
     */
    public static int sum(int a, int b){
        //why static?? sum이라는 메소드를 main에서 호출을 할려면 메모리에 sum이라는 메소드가 로딩이 되어 있어야함
        int v = a+b;
        return v;
    }

    public static int[] arrMaker(){
        int x = 10;
        int y = 20;
        int z = 30;
        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        return arr;
    }

    public static int[] arrMaker2(){
        int[] arr ={1,2,3};
        return arr;
    }
}

package kr.study;

/**
 * 데이터를 이동하라 (변수 vs 배열의 관계)
 */
public class TPC_04 {
    public static  void main(String[] args){
        /**
         *         // 배열의 선언 방법
         *         int[] a;
         *         a = new int[3]; // new 배열타입[배열사이즈]
         *         //or
         *         int[] a1 = new int[3];
         *
         *
         *         //배열에 데이터 저장하기
         *         a[0] = 10;
         *         a[1] = 20;
         *         a[2] = 30;
         */

        //4. 데이터를 이동하라(변수 vs 배열)
        int a,b,c;
        a = 10;
        b = 20;
        c = 30;
        // a + b+ c =? 메서드 처리 -> hap()

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
    }
    public static void hap(int x,int y, int z){
        /**
         * 위에 선언한 변수들을 더하려면 이렇게 따로 메소드를 생성해야 한다.
         * 그리고 더할 변수만큼 메소드에 매개변수로 생성해야 한다.
         */
        int sum = x+y+z;
        System.out.println(sum);
    }

    public static void hap1(int[] x){
        /**
         * 그러나 배열을 사용하면 메소드에 매게변수로 배열 하나만 생성하고
         * 간결하게 코드를 작성할 수 있다. 배열에 담긴 데이터를 통째로 가져왔다는 의미.
         */
        int sum = x[0] + x[1] + x[2];
        System.out.println(sum);
    }
}

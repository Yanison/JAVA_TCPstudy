package kr.study;

import kr.tpc.MovieVO;

public class TPC_17 {
    public static void main(String[] args) {
        MovieVO mv = new MovieVO("비트",12000,"연기자",12,3f);
        System.out.println(mv.toString());
    }
}

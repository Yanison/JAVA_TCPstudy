package kr.study;

import kr.tpc.DbConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC_32 {
    public static void main(String[] args) {
        /**
         *
         */

        DbConnect conn = new JavaOracle();
        conn.getConnection("url","hsy","123456");
        conn = new JavaMySQL();
        conn.getConnection("url","hsy","123456");
    }
}

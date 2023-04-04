package kr.tpc;

public class JavaMySQL implements DbConnect{

    @Override
    public void getConnection(String url, String userId, String password) {
        System.out.println(
                "Oracle DB가 접속됩니다." +
                        " url :: "+ url +
                        " userId :: "+ userId +
                        " password :: " + password
        );
    }
}

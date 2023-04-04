package kr.poly;

public class Radio implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("채널을 높혔습니다.");
    }

    @Override
    public void chDown() {
        System.out.println("채널을 낮췄습니다.");
    }

    @Override
    public void internet() {
        System.out.println("인터넷을 연결했습니다.");
    }
}

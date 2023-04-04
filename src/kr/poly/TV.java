package kr.poly;

public class TV implements RemoCon{
    int curCH =  70;
    @Override
    public void chUp() {
        if(curCH < RemoCon.MAXCH){
            curCH ++;
            System.out.println("채널을 높혔습니다. 현재 채널" + curCH);
        }else {
            System.out.println("최대 채널입니다. 현재 채널"+ curCH);
        }

    }

    @Override
    public void chDown() {
        if(curCH > RemoCon.MINCH){
            curCH --;
            System.out.println("채널을 낮췄습니다.. 현재 채널" + curCH);
        }else {
            System.out.println("최소 채널입니다. 현재 채널"+ curCH);
        }
    }

    @Override
    public void internet() {
        System.out.println("인터넷을 연결했다.");
    }
}

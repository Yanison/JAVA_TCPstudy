package kr.poly;

public interface RemoCon {
    /**
     * interface는 추상메소드의 집합인 클래스 이기 때문에 객체 생성이 안됨
     */
    public abstract void chUp();
    public void chDown();
    public void internet();

    public static final int MAXCH = 100;
    public final static int MINCH = 1;
}

package kr.tpc;

public class WellMadeDTO {
    private String name;
    private int age;

    /**
     * 디폴트 생성자를 명시적으로 만든다.
     * 오버로딩 생성자를 만들어 적절하게 초기화 한다.
     * 객체를 생성하는 작업은 생성자 내부에서 JVM이 자동으로 처리한다.
     */
    public WellMadeDTO(){}
    public WellMadeDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * private으로 만든 필드에 접근하기 위해 getter/setter 메소드를 생성한다.
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 객체가 가지고 있는 값을 출력하기 위한 toString() 메소드를 재정의한다. (디버깅용)
     */
    @Override
    public String toString(){
        return "WellMadeDTO [name = "+name+", age = "+age+"]";
    }
}

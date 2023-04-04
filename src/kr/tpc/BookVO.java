package kr.tpc;

public class BookVO {
    public String title;
    public int page;
    public int price;
    public String company;
    public BookVO(){
        /**
         * 디폴트 생성자는 객체가 생성이 될 때 정의한 필드들을 초기화 시킴
         */
        this.title ="자바";
        this.price = 140000;
        this.company = "이지스";
        this.page = 780;
    }

    public BookVO(String title,int page, int price, String company){
        /**
         * 메소드 이름이 같아도 파라미터가 다르면 다른 메소드로 인식함
         * 생성자를 재정의 할 수 있음.
         */
        this.title = title;
        this.price = price;
        this.page = page;
        this.company = company;
    }

}

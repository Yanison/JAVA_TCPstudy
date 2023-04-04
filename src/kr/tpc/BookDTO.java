package kr.tpc;

public class BookDTO {
    public String title;
    public Integer page;
    public Integer price;
    public String company;

    public BookDTO(String title, Integer page, Integer price, String company) {
        this.title = title;
        this.page = page;
        this.price = price;
        this.company = company;
    }
}

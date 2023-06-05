package model;


public class BookEntity {
    private Long id;
    private String desc;

    public void setId(Long id) {
        this.id = id;

    }

    public Long getId() { return id;}

    public void setdesc(String desc) {
        this.desc=desc;

    }

    public String getDesc() { return desc;}


    public void getDetails(Long id, String desc) {
        System.out.println("One of the best books  ===>" + desc);;

    }

}

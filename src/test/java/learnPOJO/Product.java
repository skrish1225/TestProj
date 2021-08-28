package learnPOJO;

public class Product {
    public  String Dishname;
    public int price;
    public String cusine;
    public  String hotelName;

    public Product(String dishname, int price, String cusine, String hotelName) {
        this.Dishname = dishname;
        this.price = price;
        this.cusine = cusine;
        this.hotelName = hotelName;
    }

    public String restt;
    public String khana;

    public  Product(String restt, String khana){
        this.restt = restt;
        this.khana = khana;
    }




}

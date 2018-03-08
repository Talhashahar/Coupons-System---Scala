package services;

public class Coupon {
    String Name;
    String Desc;
    int    Price;
    String pic_path;

    public Coupon(String _Name, String _Desc, int _Price, String _pic_path){
        this.Name = _Name;
        this.Desc = _Desc;
        this.Price = _Price;
        this.pic_path = _pic_path;
    }
}

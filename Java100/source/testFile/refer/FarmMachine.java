package refer;

public class FarmMachine {
    private String _price = "1000000";
    private String _createYear = "2000";
    private String _color = "red";

    public FarmMachine() {

    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public String get_createYear() {
        return _createYear;
    }

    public void set_createYear(String _createYear) {
        this._createYear = _createYear;
    }

    public String get_price() {
        return String.format("%,d", Integer.parseInt(_price));
    }

    public void set_price(String _price) {
        this._price = _price;
    }

    public FarmMachine(String price, String createYear, String color) {
        set_price(price);
        set_createYear(createYear);
        set_color(color);
    }

    public void Moving() {
        System.out.println("Farm-machine is moving");
    }

    public void Digging() {
        System.out.println("Farm-machine is Digging");
    }

    public void Grinding() {
        System.out.println("Farm-machine is Grinding");
    }
}

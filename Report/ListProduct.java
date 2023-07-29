
package Report;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
    private int id;
    private String name;
    private int qty;
    private float price;

    public ListProduct() {
    }

    public ListProduct(int id, String name, int qty, float price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }
    static List<ListProduct> list = new ArrayList<>();
}

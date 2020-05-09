import java.util.Date;

// Sa se reprezinte si produse care sunt perisabile, acestea vor ave in plus data expirarii

public class FoodProduct extends Product {
    private String alergens;
    private Date expirationDate;

    public FoodProduct() {
    }

    public FoodProduct(String name, int price, String alergens, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.alergens = alergens;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAlergens() {
        return alergens;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setAlergens(String alergens) {
        this.alergens = alergens;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}

/**
 * JAVA DOC
 * Product class
 * This class has id, description, and price which are used to connect with the invoice and
 * lineitem classes to create one application which is demoed in invoicetester
 *
 * @author student #20172422
 */
public class Product{
    int id;
    String description;
    double price;

    /** constructor */
    public Product(int id, String description, double price) {
        /** set values */
        this.id = Math.max(id, 0);   /** cannot be negative */
        this.description = description;
        this.price = Math.max(price, 0); /** cannot be negative */
    }
    /** method to get the id */
    public int getId() {
        return id;
    }
    /** method to get the description */
    public String getDescription() {
        return description;
    }
    /** method to get the price */
    public double getPrice() {
        return price;
    }
    /** method to set the id */
    public void setId(int id) {
        this.id = Math.max(id, 0);
    }
    /** method to set the description */
    public void setDescription(String description) {
        this.description = description;
    }
    /** method to set the price */
    public void setPrice(double price) {
        this.price = Math.max(price, 0);    /** cannot be negative */
    }

}
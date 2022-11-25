/**
 * JAVA DOC
 * LineItem class
 * This class has product and quantity.
 * This class also calculates the total price of all the items in the invoice tester
 *
 * @author student #20172422
 */

public class LineItem {
    //instances
    Product product;
    int quantity;

    /** constructor */
    public LineItem(Product product, int quantity) {
        /** set values */
        this.product = product;
        this.quantity = Math.max(quantity, 0);
    }
    /** method to get the products */
    public Product getProduct() {
        return product;
    }
    /** method to get the quantity */
    public int getQuantity() {
        return quantity;
    }
    /** method to set the products */
    public void setProduct(Product product) {
        this.product = product;
    }
    /** method to set the quantity */
    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }
    public double getTotal() {     /** calculate total sum */
        double sum=this.product.getPrice()*this.quantity;   /** calculate total price of the item */
        return sum;
    }
    @Override
    public String toString() {     /** print output */
        return "" + product.getId() + "\t" + product.getDescription() +
                "\t"+product.getPrice()+"\t"+this.quantity+"";
    }
}
/**
 * JAVA DOC
 * Tester for Product, Invoice and LineItem classes
 * This tester gets the Products id, description, price, and quantity
 * This will print out these values of each lineitem
 * Lastly it will calculate the price of all items combined and print out the total price
 *
 * @author student #20172422
 */
public class InvoiceTester {
    public static void main(String[] args) { /** main method */
        /** set the ids, descriptions, prices, and quantities */
        LineItem li1 = new LineItem(new Product(6, "Chicken", 20), 4); /** for item 1 */
        LineItem li2 = new LineItem(new Product(30, "Pizza", 10), 3); /** for item 2 */
        LineItem li3 = new LineItem(new Product(7, "Steak", 20), 5); /** for item 3 */
        /** invoice object */
        Invoice v = new Invoice(li1, li2, li3);
        /** get the total price of 3 items */
        double total = v.getTotalInvoice();
        /** print the items */
        System.out.println("Id\tName\tPrice\tQuantity\tTotal");
        System.out.println(li1+"\t\t\t"+li1.getTotal());
        System.out.println(li2+"\t\t\t"+li2.getTotal());
        System.out.println(li3+"\t\t\t"+li3.getTotal());
        System.out.println("Total:\t\t\t\t\t\t\t"+total);  /** print total of items price */

    }

}

/**
 * JAVA DOC
 * Invoice class
 * This class has lineitem 1, lineitem 2, and lineitem 3
 * These lineitems are placed into the invoice tester
 * to help complete the application
 *
 * @author student #20172422
 */
public class Invoice {
    LineItem lineItem1;
    LineItem lineItem2;
    LineItem lineItem3;

    /** constructor */
    public Invoice(LineItem lineItem1, LineItem lineItem2, LineItem lineItem3) {
        /** set values */
        this.lineItem1 = lineItem1;
        this.lineItem2 = lineItem2;
        this.lineItem3 = lineItem3;
    }
    /** method to get each item */
    public void getLineItem(int line,LineItem lineItem) {
        if(line==1) {    /** for item 1 */
            this.lineItem1 = lineItem;
        }
        else if(line==2) {    /** for item 2 */
            this.lineItem2 = lineItem;
        }
        else if(line==3) {    /** for item 3 */
            this.lineItem3 = lineItem;
        }

    }
    /** method to set each item */
    public void setLineItem(int line,LineItem lineItem) {
        if(line==1) {    /** for item 1 */
            this.lineItem1 = lineItem;
        }
        else if(line==2) {    /** for item 2 */
            this.lineItem2 = lineItem;
        }
        else if(line==3) {    /** for item 3 */
            this.lineItem3 = lineItem;
        }
    }
    /** method to get total */
    public double getTotalInvoice() {
        double total=this.lineItem1.getTotal()+this.lineItem2.getTotal()+this.lineItem3.getTotal();/**calculate total */
        return total;
    }
}

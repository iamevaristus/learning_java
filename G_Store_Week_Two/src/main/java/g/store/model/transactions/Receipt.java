package g.store.model.transactions;

import g.store.enums.transactions.PaymentMethod;
import g.store.model.entities.Customer;

import java.util.*;

/**
 * This is a class of G-Store's Receipt, and it contains the following params:
 * <p>
 * {@code @params}  UUID receiptId
 * {@code @params} DateTime issueDate
 * {@code @params} Integer totalAmount
 *
 * @author Evaristus Adimonyemma
 */
public class Receipt{

    /**
     * RECEIPT ID
     */
    private UUID receiptId;

    /**
     * ISSUED DATE
      */
    private Date issuedDate;

    /**
     * This is the customer who is getting a receipt
     */
    private Customer customer;

    /*
    This is the payment method provided by the customer
     */
    private PaymentMethod paymentMethod;

    @Override
    public String toString() {
        String customerDetails = customer.toStringWithCart();

        String header = "The receipt information for this transaction is as follows:\n\n";

        String receiptInfo =
                "ID: " + receiptId + "\n" +
                "Issued Date: " +  issuedDate.toString() + "\n" +
                "Customer Information: " + customerDetails + "\n";
        return header + receiptInfo;
    }

    public Receipt(
            UUID receiptId,
            Date issuedDate,
            Customer customer,
            PaymentMethod paymentMethod
    ) {
        this.receiptId = receiptId;
        this.issuedDate = issuedDate;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
    }

//    public UUID getReceiptId() {
//        return receiptId;
//    }

//    public void setReceiptId(UUID receiptId) {
//        this.receiptId = receiptId;
//    }

//    public PaymentMethod getPaymentMethod() {
//        return paymentMethod;
//    }

//    public void setPaymentMethod(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public Date getIssuedDate() {
//        return issuedDate;
//    }
//
//    public void setIssuedDate(Date issuedDate) {
//        this.issuedDate = issuedDate;
//    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}

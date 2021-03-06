package PaystackApi.paystack.dto;

import PaystackApi.paystack.enums.Bearers;
import PaystackApi.paystack.enums.Channels;

public class TransactionRequestDto {

    /**
     * As we all know,for some transaction to take place,some infos needs to provided
     * They are requested as far as a transaction is taking place
     * 1.The transaction fields
     * 2.we create a setter and a getter for it
     */
    private String amount;
    private String email;
    private String reference;
    private String callback_url;
    private Integer invoice_limit;
    private Channels[] channels;
    private String subaccount;
    private Integer transaction_charge;
    // @Enumerated(EnumType.STRING)
    private Bearers paystackBearer = Bearers.ACCOUNT;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public Integer getInvoice_limit() {
        return invoice_limit;
    }

    public void setInvoice_limit(Integer invoice_limit) {
        this.invoice_limit = invoice_limit;
    }

    public Channels[] getChannels() {
        return channels;
    }

    public void setChannels(Channels[] channels) {
        this.channels = channels;
    }

    public String getSubaccount() {
        return subaccount;
    }

    public void setSubaccount(String subaccount) {
        this.subaccount = subaccount;
    }

    public Integer getTransaction_charge() {
        return transaction_charge;
    }

    public void setTransaction_charge(Integer transaction_charge) {
        this.transaction_charge = transaction_charge;
    }

    public Bearers getPaystackBearer() {
        return paystackBearer;
    }

    public void setPaystackBearer(Bearers paystackBearer) {
        this.paystackBearer = paystackBearer;
    }
}

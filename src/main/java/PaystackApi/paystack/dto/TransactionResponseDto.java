package PaystackApi.paystack.dto;

/**
 * Yes! You made a transaction right? I think there should be something like a confirmation that will
 * assure us that our transaction is successful
 * 1.we create the response fields
 * 2.we create a setter and getter for it
 * Well its fine if you want to use lombok-just do @Data or @Getter and @Setter respectively
 */
public class TransactionResponseDto {
    private String message;
    private String status;
    private Datas datas;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Datas getDatas() {
        return datas;
    }

    public void setDatas(Datas datas) {
        this.datas = datas;
    }
}

package PaystackApi.paystack.dto;

/**
 *These are the datas we're using to access the api-Application programming interface of paystack services
 */
public class Datas {
    private String authorization_url;
    private String access_code;
    private String reference;

    public String getAuthorization_url() {
        return authorization_url;
    }

    public void setAuthorization_url(String authorization_url) {
        this.authorization_url = authorization_url;
    }

    public String getAccess_code() {
        return access_code;
    }

    public void setAccess_code(String access_code) {
        this.access_code = access_code;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

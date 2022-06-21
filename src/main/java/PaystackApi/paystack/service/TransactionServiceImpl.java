package PaystackApi.paystack.service;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import  org.springframework.http.HttpHeaders;

/**
 * When we are talking about the service class, we are talking about the real logic behind the code
 * Firstly, we initialize the rest template. Don't forget the api is that of rest
 * Of course, we will need a request header for the key we're generating
 * So we initialize the HttpHeaders
 */
@Service
public class TransactionServiceImpl implements TransactionService{
    RestTemplate restTemplate = new RestTemplate();

    /**
     * the url link lead us straight to the paystack service provider
     *  * Then we generate the Paystack api key...for experimenting do TEST but for serious business do LIVE
     *  * IN ANY CASE DO NOT MAKE YOUR LIVE KEY PUBLIC, BUT IN THE CASE OF TEST,YOU CAN!
     *  * Then go ahead to map the header with the key
     *  * Then we use the response Dto to print out the response of the transaction and the request header
     * @param transactionRequestDto
     * @return
     */
    @Override
    public TransactionResponseDto initializeTransaction(TransactionRequestDto transactionRequestDto) {
        String url = "https://api.paystack.co/transaction/initialize";
       HttpHeaders httpHeaders = new HttpHeaders();
        String key = "sk_test_f429ff01ba911e7184bc21f9283b41bf8c09c683";
        httpHeaders.setContentType
                (MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "Bearer " + key);

        HttpEntity<TransactionRequestDto> entity = new HttpEntity<>(transactionRequestDto, httpHeaders);

        ResponseEntity<TransactionResponseDto> response = restTemplate.postForEntity(url, entity,
                                TransactionResponseDto.class);
        return response.getBody();
    }
}

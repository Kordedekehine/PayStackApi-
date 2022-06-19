package PaystackApi.paystack.service;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import  org.springframework.http.HttpHeaders;

@Service
public class TransactionServiceImpl implements TransactionService{
    RestTemplate restTemplate = new RestTemplate();

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

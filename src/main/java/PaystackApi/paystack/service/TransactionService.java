package PaystackApi.paystack.service;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;

public interface TransactionService {

    TransactionResponseDto initializeTransaction (TransactionRequestDto transactionRequestDto);
}

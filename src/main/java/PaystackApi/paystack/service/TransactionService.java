package PaystackApi.paystack.service;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;

/**
 * We make a call to our transaction requests through interface
 */
public interface TransactionService {

    TransactionResponseDto initializeTransaction (TransactionRequestDto transactionRequestDto);
}

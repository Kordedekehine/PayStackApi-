package PaystackApi.paystack.controllers;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;
import PaystackApi.paystack.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/paystack/v1")
public class TransactionController {
        @Autowired
         TransactionService transactionService;

        @PostMapping(path = "/initializetransaction")
        public TransactionResponseDto initializeTransaction(@RequestBody TransactionRequestDto
                transactionRequestDto) {TransactionResponseDto initializeTransaction =
                    transactionService.initializeTransaction(transactionRequestDto);
            return initializeTransaction;
        }

}





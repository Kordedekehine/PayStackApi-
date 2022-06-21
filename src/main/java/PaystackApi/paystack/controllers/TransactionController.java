package PaystackApi.paystack.controllers;

import PaystackApi.paystack.dto.TransactionRequestDto;
import PaystackApi.paystack.dto.TransactionResponseDto;
import PaystackApi.paystack.service.TransactionService;
import PaystackApi.paystack.util.ApiRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRoutes.PAYSTACK)
public class TransactionController {

    /**
     * we call the transactionservice class so as to get the students we need inside of it
     * We are sending a request right? Then we use POST same as POSTMAPPING
     * we use at @Request body since we are expected to send a parameter..which is the body we requesting
     * then we use the logic already set in the transaction service, you remember? Check again
     */
    @Autowired
         TransactionService transactionService;

        @PostMapping(path = "/initializetransaction")
        public TransactionResponseDto initializeTransaction(@RequestBody TransactionRequestDto
                transactionRequestDto) {TransactionResponseDto initializeTransaction =
                    transactionService.initializeTransaction(transactionRequestDto);
            return initializeTransaction;
        }
    /**
     * to test with postman? you use the api inside the ApiRoute Class, then we can access it using
     * /api/paystack/v1/initializetransaction. Also, dont forget to set your token
     * Moreover, you can set the token header to automatically call in postman
     */

}





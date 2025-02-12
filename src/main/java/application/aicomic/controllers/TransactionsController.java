package application.aicomic.controllers;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.TransactionsDTO;
import application.aicomic.models.Comments;
import application.aicomic.models.Transactions;
import application.aicomic.services.TransactionsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/transaction")
@RestController
public class TransactionsController {
    private TransactionsService transactionsService;

    @GetMapping
    public List<Transactions> getAllTransactions() {
        return transactionsService.getAllTransactions();
    }
    @PostMapping
    public Transactions addTransaction(@RequestBody Transactions transactions) {
        return transactionsService.addTransaction(transactions);
    }

    @PutMapping("/{update}")
    public Transactions updateTransaction(@PathVariable String id, @RequestBody TransactionsDTO transactionsDTO) {
        return transactionsService.updateTransaction(id, transactionsDTO);
    }
    @GetMapping("/{getById}")
    public Transactions getTransactionById(@PathVariable String id) {
        return transactionsService.getTransactionById(id);
    }
    @DeleteMapping("/{delete}")
    public Transactions deleteTransaction(@PathVariable String id) {
        return transactionsService.deleteTransaction(id);
    }
}

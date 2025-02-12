package application.aicomic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import application.aicomic.dataAccess.WalletsDTO;
import application.aicomic.models.Wallets;
import java.util.List;
import application.aicomic.services.WalletsService;

@RestController
public class WaletsController {
    private WalletsService walletsService;

    @GetMapping
    public List<Wallets> getAllWallets() {
        return walletsService.getAllWallets();
    }

    @GetMapping
    public Wallets getWalletById(@PathVariable String walletsId) {
        return walletsService.getWalletById(walletsId);
    }

    @PostMapping("/{create}")
    public Wallets createWallets(@RequestBody Wallets wallets) {
        return walletsService.saveWallets(wallets);
    }

    @PutMapping("/{update}")
    public Wallets updateWallets(@PathVariable String id, @RequestBody WalletsDTO walletsDTO) {
        return walletsService.updateWallets(id, walletsDTO);
    }
}

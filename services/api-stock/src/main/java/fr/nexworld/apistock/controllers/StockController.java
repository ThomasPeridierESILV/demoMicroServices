package fr.nexworld.apistock.controllers;

import fr.nexworld.apistock.services.StockService;
import fr.nexworld.domain.entities.Stock;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/stocks")
public class StockController {

    private StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{id}")
    Stock get(@PathVariable Long id) {
        return this.stockService.get(id);
    }

    @GetMapping
    List<Stock> getAll() {
        return this.stockService.getAll();
    }

    @PostMapping
    Stock post(@RequestBody Stock stock) {
        return this.stockService.post(stock);
    }

    @PutMapping("/{id}")
    Stock put(@RequestBody Stock stock, @PathVariable Long id) {
        return this.stockService.put(stock, id);
    }
}
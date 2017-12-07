package fr.nexworld.serverspringboot.controller;

import fr.nexworld.serverspringboot.entities.Stock;
import fr.nexworld.serverspringboot.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/stocks")
public class StockController {

    private StockService stockService;

    @Autowired
    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @GetMapping("/{id}")
    Stock get(@PathVariable Long id){
        return stockService.get(id);
    }

    @GetMapping
    List<Stock> getAll(){
        return stockService.getAll();
    }

    @PostMapping
    Stock post(@RequestBody Stock stock){ return stockService.post(stock);}

    @PutMapping("/{id}")
    Stock put(@RequestBody Stock stock, @PathVariable Long id){ return stockService.put(stock, id);}
}

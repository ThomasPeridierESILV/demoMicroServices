package fr.nexworld.springbootserver.controller;

import fr.nexworld.springbootserver.entities.Stock;
import fr.nexworld.springbootserver.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = "*", allowedHeaders ="*")
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

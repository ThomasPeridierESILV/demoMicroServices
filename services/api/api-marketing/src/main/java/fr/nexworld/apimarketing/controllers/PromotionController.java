package fr.nexworld.apimarketing.controllers;

import fr.nexworld.apimarketing.entities.Promotion;
import fr.nexworld.apimarketing.services.PromotionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/promotions")
public class PromotionController {

    private PromotionService promotionService;

    @Autowired
    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @GetMapping("/{id}")
    Promotion get(@PathVariable Long id) {
        return this.promotionService.get(id);
    }

    @GetMapping
    List<Promotion> getAll() {
        return this.promotionService.getAll();
    }

    @PostMapping
    Promotion post(@RequestBody Promotion promotion) {
        return this.promotionService.post(promotion);
    }

    @PutMapping("/{id}")
    Promotion put(@RequestBody Promotion promotion, @PathVariable Long id) {
        return this.promotionService.put(promotion, id);
    }
}
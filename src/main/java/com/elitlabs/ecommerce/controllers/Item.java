package com.elitlabs.ecommerce.controllers;

import com.elitlabs.ecommerce.models.ItemDTO;
import com.elitlabs.ecommerce.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/item")
public class Item {

    @Autowired
    private ItemService itemService;

    @GetMapping("/all")
    public List<ItemDTO> allStock(){
        return itemService.allItems();
    }

    @PostMapping("/add")
    public String addItem(@RequestBody ItemDTO itemData){
        return itemService.saveItem(itemData);
    }

    @PutMapping("/update")
    public String updateItem(@RequestBody ItemDTO itemData){
        return itemService.updateItem(itemData);
    }

    @GetMapping("/find/{id}")
    public Optional<ItemDTO> searchItem(@PathVariable Integer id){
        return itemService.searchItem(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Integer id){
        return itemService.deleteItem(id);
    }
}

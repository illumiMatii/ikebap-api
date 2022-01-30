package com.ikebap.project.controllers;

import com.ikebap.project.model.Item;
import com.ikebap.project.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private final ItemRepository itemRepository;

    public MenuController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    /*
    @GetMapping("/items/{id}")
    public Item addItem(@PathVariable Long id) {
        return itemRepository.findItemById(id);
    }
    */

}

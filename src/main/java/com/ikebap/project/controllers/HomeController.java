package com.ikebap.project.controllers;

import com.ikebap.project.model.Item;
import com.ikebap.project.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    private final ItemRepository itemRepository;

    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

   /* @GetMapping
    public List<Item> getItems() {
        return itemRepository.findAll();
    } */

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemRepository.findItemById(id);
    }
}

package com.ikebap.project.repository;

import com.ikebap.project.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findItemsById(Long id);

    Item findItemById(Long id);
}

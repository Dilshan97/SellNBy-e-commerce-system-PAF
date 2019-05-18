package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.ItemDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<ItemDTO> allItems();

    String saveItem(ItemDTO itemData);

    String updateItem(Integer id, ItemDTO itemData);

    Optional<ItemDTO> searchItem(Integer id);

    String deleteItem(Integer id);
}

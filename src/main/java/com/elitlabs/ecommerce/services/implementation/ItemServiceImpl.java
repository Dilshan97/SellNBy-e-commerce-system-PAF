package com.elitlabs.ecommerce.services.implementation;

import com.elitlabs.ecommerce.models.ItemDTO;
import com.elitlabs.ecommerce.repositories.ItemRepository;
import com.elitlabs.ecommerce.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDTO> allItems() {
        List<ItemDTO> allStock = itemRepository.findAll();
        return allStock;
    }

    @Override
    public String saveItem(ItemDTO itemData) {
       itemRepository.save(itemData);
        return "Item added";
    }

    @Override
    public String updateItem(ItemDTO itemData) {

        String msg = null;

        if (itemData.getItem_id() != null){
            itemRepository.save(itemData);
            msg = "Item Updated";
        }
        else {
            msg = "Can't update Item";
        }
        return msg;
    }

    @Override
    public Optional<ItemDTO> searchItem(Integer id) {
        return itemRepository.findById(id);
    }

    @Override
    public String deleteItem(Integer id) {
        itemRepository.deleteById(id);
        return "Item Deleted";
    }
}

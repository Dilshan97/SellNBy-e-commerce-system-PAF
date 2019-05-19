package com.elitlabs.ecommerce.test;

import com.elitlabs.ecommerce.controllers.Item;
import com.elitlabs.ecommerce.models.ItemDTO;
import com.elitlabs.ecommerce.services.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = Item.class, secure = false)
public class ItemServiceTestClient {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemService itemService;

    @Test
    public void find() throws Exception {

        ItemDTO newitem = new ItemDTO();
        newitem.setItem_id(2);
        newitem.setItem_name("Apple Macbook Pro");
        newitem.setModel_name("Apple");
        newitem.setItem_desc("Apple mact book pro for sale");
        newitem.setSeller("dilshan");
        newitem.setStock(2);
        newitem.setUnit_price(15000.00);
        newitem.setStatus(true);

        List<ItemDTO> itemDTOS = Arrays.asList(newitem);
        given(itemService.allItems()).willReturn(itemDTOS);

        this.mockMvc.perform((get("http://localhost:8080/api/item/all")))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'item_name': 'Apple Macbook Pro', 'model_name': 'Apple', 'item_desc': 'Apple mact book pro for sale', 'seller': 'dilshan', 'stock': 2, 'unit_price': 15000.00, 'status': true}]"));
    }
}

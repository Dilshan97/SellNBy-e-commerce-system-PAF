package com.elitlabs.ecommerce.repositories;

import com.elitlabs.ecommerce.models.ItemDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemDTO, Integer> {


}

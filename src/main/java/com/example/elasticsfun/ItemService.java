package com.example.elasticsfun;

import com.example.elasticsfun.elastic.models.Item;
import com.example.elasticsfun.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public boolean hasNoRunningNoWith(short importData) {
        return this.itemRepository.countByRunningNo(importData) <= 0;
    }

    public void saveRandoItem(short number, String text){
        this.itemRepository.save(new Item(UUID.randomUUID().toString(),text,number));
    }

    public List<Item> getItemsForRunningNo(short number){
        return this.itemRepository.findByRunningNo(number);
    }
}

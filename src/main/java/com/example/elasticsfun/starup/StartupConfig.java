package com.example.elasticsfun.starup;

import com.example.elasticsfun.ItemService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StartupConfig {
    private static final Logger LOG = LoggerFactory.getLogger(StartupConfig.class);
    private final ItemService itemService;

    @Autowired
    public StartupConfig(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostConstruct
    public void postConstructImport(){
        short importData = (short)0;
        if (this.itemService.hasNoRunningNoWith(importData)){
            LOG.info("Inserting data for {}", importData);
            itemService.saveRandoItem(importData,"test" + UUID.randomUUID());
            itemService.saveRandoItem(importData,"test" + UUID.randomUUID());
            itemService.saveRandoItem(importData,"test" + UUID.randomUUID());
        }
        else{
            LOG.info("No data inserted!");
        }
    }
}

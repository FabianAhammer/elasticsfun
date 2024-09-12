package com.example.elasticsfun.repository;


import com.example.elasticsfun.elastic.models.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends ElasticsearchRepository<Item, String> {
    List<Item> findByRunningNo(short runningNo);
    long countByRunningNo(short runningNo);
}

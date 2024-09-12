package com.example.elasticsfun.elastic.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="item")
public class Item {
    @Id
    private String id;
    private String text;
    private short runningNo;

    public Item(String id, String text, short runningNo) {
        this.id = id;
        this.text = text;
        this.runningNo = runningNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public short getRunningNo() {
        return runningNo;
    }

    public void setRunningNo(short runningNo) {
        this.runningNo = runningNo;
    }
}

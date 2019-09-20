package ru.ivozklyakov.springBoot.dao.entity;

import java.io.Serializable;

public class EventBufferId implements Serializable {
    private Long objectId;
    private Long objectTypeId;
    private Long listenerId;

    public EventBufferId(Long objectId, Long objectTypeId, Long listenerId) {
        this.objectId = objectId;
        this.objectTypeId = objectTypeId;
        this.listenerId = listenerId;
    }
}

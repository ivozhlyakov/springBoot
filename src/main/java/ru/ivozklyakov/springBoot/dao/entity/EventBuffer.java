package ru.ivozklyakov.springBoot.dao.entity;

import javax.persistence.*;

@Entity
@IdClass(EventBufferId.class)
@Table(name = "TAX_EVENTBUFFER")
public class EventBuffer {

    @Id
    @Column(name = "OBJECTTYPEID")
    private Long objectTypeId;
    @Id
    @Column(name = "OBJECTID")
    private Long objectId;
    @Id
    @Column(name = "LISTENERID")
    private Long listenerId;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "ACTION")
    private Integer action;
    @Column(name = "ERRORCODE")
    private Long errorCode;
    @Column(name = "HANDLERID")
    private Long handlerId;

    public EventBuffer() {
    }

    public Long getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(Long objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getListenerId() {
        return listenerId;
    }

    public void setListenerId(Long listenerId) {
        this.listenerId = listenerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public Long getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
    }
}

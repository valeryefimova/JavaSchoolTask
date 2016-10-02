package com.tsystems.efimova.entities;

import com.tsystems.efimova.entities.enums.DeliveryMethod;
import com.tsystems.efimova.entities.enums.OrderStatus;
import com.tsystems.efimova.entities.enums.PaymentMethod;
import com.tsystems.efimova.entities.enums.PaymentStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Order")
public class OrderEntity {

    @Id
    @Column(name = "oid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    @OneToOne
    @JoinColumn(name = "clid", referencedColumnName = "clid")
    private ClientEntity client;

    @OneToOne
    @JoinColumn(name = "aid", referencedColumnName = "aid")
    private ClientAdressEntity adress;

    @Column(name = "paymethod")
    private PaymentMethod payMethod;

    @Column(name = "delmethod")
    private DeliveryMethod delMethod;

    @Column(name = "paystatus")
    private PaymentStatus payStatus;

    @Column(name = "orderstatus")
    private OrderStatus orderStatus;

    @Column(name = "payinfo", length = 50)
    private String paymentInfo;

    @OneToMany(mappedBy = "itid")
    private List<ItemEntity> items;

    public OrderEntity() {}

    public OrderEntity(ClientEntity client, ClientAdressEntity adress, PaymentMethod payMethod, DeliveryMethod delMethod, PaymentStatus payStatus, OrderStatus orderStatus, String paymentInfo, List<ItemEntity> items) {
        this.client = client;
        this.adress = adress;
        this.payMethod = payMethod;
        this.delMethod = delMethod;
        this.payStatus = payStatus;
        this.orderStatus = orderStatus;
        this.paymentInfo = paymentInfo;
        this.items = items;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public ClientAdressEntity getAdress() {
        return adress;
    }

    public void setAdress(ClientAdressEntity adress) {
        this.adress = adress;
    }

    public PaymentMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PaymentMethod payMethod) {
        this.payMethod = payMethod;
    }

    public DeliveryMethod getDelMethod() {
        return delMethod;
    }

    public void setDelMethod(DeliveryMethod delMethod) {
        this.delMethod = delMethod;
    }

    public PaymentStatus getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(PaymentStatus payStatus) {
        this.payStatus = payStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }

    public void addItem(ItemEntity item) {
        this.items.add(item);
    }
}

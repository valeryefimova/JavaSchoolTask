package com.tsystems.efimova.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Item")
public class ItemEntity {

    @Id
    @Column(name = "itid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itid;

    @OneToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    private CategoryEntity category;

    @Column(name = "itname", nullable = false, length = 50)
    private String itname;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "weight")
    private float weight;

    @Column(name = "volum")
    private float volum;

    @Column(name = "instock", nullable = false)
    private long instock;

    @Column(name = "purchnum", nullable = false)
    private long purchnum;

    @Column(name = "description", length = 500)
    private String description;

    @OneToMany(mappedBy = "itfid")
    private List<ItemFeatureEntity> features;

    public ItemEntity() {}

    public ItemEntity(CategoryEntity category, String itname, float price, float weight, float volum, long instock, String description, List<ItemFeatureEntity> features) {
        this.category = category;
        this.itname = itname;
        this.price = price;
        this.weight = weight;
        this.volum = volum;
        this.instock = instock;
        this.purchnum = 0;
        this.description = description;
        this.features = features;
    }

    public long getItid() {
        return itid;
    }

    public void setItid(long itid) {
        this.itid = itid;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getItname() {
        return itname;
    }

    public void setItname(String itname) {
        this.itname = itname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public long getInstock() {
        return instock;
    }

    public void setInstock(long instock) {
        this.instock = instock;
    }

    public long getPurchnum() {
        return purchnum;
    }

    public void setPurchnum(long purchnum) {
        this.purchnum = purchnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemFeatureEntity> getFeatures() {
        return features;
    }

    public void setFeatures(List<ItemFeatureEntity> features) {
        this.features = features;
    }

    public void addFeature(ItemFeatureEntity feature) {
        this.features.add(feature);
    }
}

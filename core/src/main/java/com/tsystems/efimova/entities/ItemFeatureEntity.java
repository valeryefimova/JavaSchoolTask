package com.tsystems.efimova.entities;

import javax.persistence.*;

@Entity
@Table(name = "itemfeature")
public class ItemFeatureEntity {

    @Id
    @Column(name = "itfid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itfid;

    @OneToOne
    @JoinColumn(name = "itid", referencedColumnName = "itid")
    private ItemEntity item;

    @OneToOne
    @JoinColumn(name = "fid", referencedColumnName = "fid")
    private FeatureEntity feature;

    @Column(name = "value", length = 50)
    private String value;

    public ItemFeatureEntity() {}

    public ItemFeatureEntity(ItemEntity item, FeatureEntity feature, String value) {
        this.item = item;
        this.feature = feature;
        this.value = value;
    }

    public long getItfid() {
        return itfid;
    }

    public void setItfid(long itfid) {
        this.itfid = itfid;
    }

    public ItemEntity getItem() {
        return item;
    }

    public void setItem(ItemEntity item) {
        this.item = item;
    }

    public FeatureEntity getFeature() {
        return feature;
    }

    public void setFeature(FeatureEntity feature) {
        this.feature = feature;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package com.tsystems.efimova.entities;

import javax.persistence.*;

@Entity
@Table(name="category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private long cid;

    @Column(name = "cname", nullable = false, length = 50)
    private String cname;

    public CategoryEntity() {}

    public CategoryEntity(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}

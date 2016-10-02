package com.tsystems.efimova.entities;

import javax.persistence.*;

@Entity
@Table(name="Feature")
public class FeatureEntity {

    @Id
    @Column(name = "fid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long fid;

    @Column(name = "fname", nullable = false, length = 50)
    private String fname;

    public FeatureEntity(String fname) {
        this.fname = fname;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}

package com.shorgov.dbtest.testpostgres;

import jakarta.persistence.*;
import jakarta.persistence.Table;
//import org.hibernate.annotations.*;
//import org.hibernate.annotations.Parameter;

@Entity
@Table(name="detail")
public class Detail {

    @Id
    @Column(name="id")
//    @GeneratedValue(generator="gen")
//    @GenericGenerator(name="gen",
//            strategy="foreign",
//            parameters=@Parameter(name="property", value="master"))
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private Master master;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }
}
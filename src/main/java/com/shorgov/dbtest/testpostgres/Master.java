package com.shorgov.dbtest.testpostgres;


import jakarta.persistence.*;

@Entity
@Table(name = "master")
public class Master {

    @Id
//    @SequenceGenerator(name="pk_sequence",sequenceName="master_id_seq", allocationSize=1)
//    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String text;

    @OneToOne(mappedBy = "master")
    private Detail detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}

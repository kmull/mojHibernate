package com.infoshareacademy.car.domain.model;

import javax.persistence.*;

@Entity
public class Webpage {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, unique=true)
    private Long id;

    @Column
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Webpage{" +
                "id=" + id +
                ", adres='" + address + '\'' +
                '}';
    }
}

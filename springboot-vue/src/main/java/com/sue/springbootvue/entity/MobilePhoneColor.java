package com.sue.springbootvue.entity;

import javax.persistence.*;

@Entity
@Table(name = "mobilephone_color", schema = "springbootvue")
public class MobilePhoneColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "mobilephone_id")
    private MobilePhone mobilePhone;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

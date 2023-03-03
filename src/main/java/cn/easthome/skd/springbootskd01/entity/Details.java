package cn.easthome.skd.springbootskd01.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Details {

    @Id
    @GeneratedValue
    private Integer id;
    private Date time;
    private String province;
    private String city;
    private Integer confirm;
    private Integer confirm_add;
    private Integer heal;
    private Integer dead;

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", time=" + time +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", confirm=" + confirm +
                ", confirm_add=" + confirm_add +
                ", heal=" + heal +
                ", dead=" + dead +
                '}';
    }

    public Details() {
    }

    public Details(Integer id, Date time, String province, String city, Integer confirm, Integer confirm_add, Integer heal, Integer dead) {
        this.id = id;
        this.time = time;
        this.province = province;
        this.city = city;
        this.confirm = confirm;
        this.confirm_add = confirm_add;
        this.heal = heal;
        this.dead = dead;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public Integer getConfirm_add() {
        return confirm_add;
    }

    public void setConfirm_add(Integer confirm_add) {
        this.confirm_add = confirm_add;
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getDead() {
        return dead;
    }

    public void setDead(Integer dead) {
        this.dead = dead;
    }
}
package cn.easthome.skd.springbootskd01.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 封装一个History类和数据库中的history对应
 */

@Entity
public class History {

    @Id
    @GeneratedValue
    private Date ds;
    private Integer confirm;
    private Integer confirm_add;
    private Integer suspect;
    private Integer suspect_add;
    private Integer heal;
    private Integer heal_add;
    private Integer dead;
    private Integer dead_add;

    public History() {
    }

    public History(Date ds, Integer confirm, Integer confirm_add, Integer suspect, Integer suspect_add, Integer heal, Integer heal_add, Integer dead, Integer dead_add) {
        this.ds = ds;
        this.confirm = confirm;
        this.confirm_add = confirm_add;
        this.suspect = suspect;
        this.suspect_add = suspect_add;
        this.heal = heal;
        this.heal_add = heal_add;
        this.dead = dead;
        this.dead_add = dead_add;
    }

    public Date getDs() {
        return ds;
    }

    public void setDs(Date ds) {
        this.ds = ds;
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

    public Integer getSuspect() {
        return suspect;
    }

    public void setSuspect(Integer suspect) {
        this.suspect = suspect;
    }

    public Integer getSuspect_add() {
        return suspect_add;
    }

    public void setSuspect_add(Integer suspect_add) {
        this.suspect_add = suspect_add;
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getHeal_add() {
        return heal_add;
    }

    public void setHeal_add(Integer heal_add) {
        this.heal_add = heal_add;
    }

    public Integer getDead() {
        return dead;
    }

    public void setDead(Integer dead) {
        this.dead = dead;
    }

    public Integer getDead_add() {
        return dead_add;
    }

    public void setDead_add(Integer dead_add) {
        this.dead_add = dead_add;
    }

    @Override
    public String toString() {
        return "History{" +
                "ds=" + ds +
                ", confirm=" + confirm +
                ", confirm_add=" + confirm_add +
                ", suspect=" + suspect +
                ", suspect_add=" + suspect_add +
                ", heal=" + heal +
                ", heal_add=" + heal_add +
                ", dead=" + dead +
                ", dead_add=" + dead_add +
                '}';
    }
}

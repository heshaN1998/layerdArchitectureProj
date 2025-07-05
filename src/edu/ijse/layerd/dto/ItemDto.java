/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dto;

/**
 *
 * @author ACER
 */
public class ItemDto {
 private String code;
 private String desc;
 private String pack;
 private double unitPrize;
 private int qoh;

    public ItemDto() {
    }

    public ItemDto(String code, String desc, String pack, Double unitPrize, Integer qoh) {
        this.code = code;
        this.desc = desc;
        this.pack = pack;
        this.unitPrize = unitPrize;
        this.qoh = qoh;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * @return the unitPrize
     */
    public Double getUnitPrize() {
        return unitPrize;
    }

    /**
     * @param unitPrize the unitPrize to set
     */
    public void setUnitPrize(Double unitPrize) {
        this.unitPrize = unitPrize;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "itemDto{" + "code=" + code + ", desc=" + desc + ", pack=" + pack + ", unitPrize=" + unitPrize + ", qoh=" + qoh + '}';
    }
 
 
 
}

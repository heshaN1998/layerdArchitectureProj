/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;
import edu.ijse.layerd.dao.CrudUtil;
import edu.ijse.layerd.dao.custom.ItemDao;
import edu.ijse.layerd.entity.ItemEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author ACER
 */
public class ItemDaoImpl implements ItemDao{

    @Override
    public boolean save(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Item Value(?,?,?,?,?)", t.getCode(),t.getDesc(),t.getPack(),t.getUnitPrize(),t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Item SET Description =? ,PackSize = ?,UnitePrize =?,QtyOnHand = ? WHERE Code = ?", t.getDesc(),t.getPack(),t.getUnitPrize(),t.getQoh(),t.getCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM Item WHERE ItemCode=?", id);
    }

    @Override
    public ItemEntity search(String id) throws Exception {
    ResultSet rst=CrudUtil.executeQuery("SELECT * FROM Item WHERE ItemCode=?", id);
    if(rst.next()){
    return new ItemEntity(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"), rst.getDouble("UnitPrize"), rst.getInt("QtyOnHand"));
    }
    return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM Item");
        ArrayList<ItemEntity> itemEntities=new ArrayList<>();
        while(rst.next()){
        itemEntities.add(new ItemEntity(rst.getString("ItemCode"),rst.getString("Description"), rst.getString("PackSize"), rst.getDouble("unitPrize"), rst.getInt("QtyOnHand")));
        }
       
        return itemEntities;
    }
    
}

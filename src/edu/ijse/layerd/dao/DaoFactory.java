/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao;
import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.ItemDao;
import edu.ijse.layerd.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author ACER
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
    if(daoFactory == null){
    daoFactory = new DaoFactory();
    }
    return daoFactory;
    }
    public SuperDao geDao(DaoTypes types){
        switch (types) {
            case ITEM:
                return new ItemDaoImpl();
               case CUSTOMER:
                return new CustomerDaoImpl();
                case ORDER:
                return null;
                case ORDER_DETAIL:
                return null;
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
    ITEM,CUSTOMER,ORDER,ORDER_DETAIL
    }
    
}

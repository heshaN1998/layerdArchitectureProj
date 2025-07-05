/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.ItemDao;
import edu.ijse.layerd.dao.custom.impl.ItemDaoImpl;
import edu.ijse.layerd.dto.ItemDto;
import edu.ijse.layerd.entity.ItemEntity;
import edu.ijse.layerd.service.custom.ItemService;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class ItemServiceImpl implements ItemService{

    /**
     *
     * @param itemDto
     * @return
     * @throws Exception
     */
    @Override   
public String saveItem(ItemDto itemDto) throws Exception {
    ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
    itemDto.getDesc(),itemDto.getPack(),itemDto.getUnitPrize(),itemDto.getQoh());
   
    boolean isSaved  = ItemDao.save(itemEntity);
    return isSaved ? "Success" : "Fail";
    
    }

    @Override
    public String updatetem(ItemDto itemDto) throws Exception {
       ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
    itemDto.getDesc(),itemDto.getPack(),itemDto.getUnitPrize(),itemDto.getQoh());
   
    boolean isUpdate = itemUpdate(itemEntity);
    return isUpdate ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String id) throws Exception {
       
        boolean isDeleted = itemDao.delete(id);
        return isDeleted ? "Success" : "Fail";

    }

    @Override
    public String searchItem(String id) throws Exception {

      ItemEntity itemEntity = itemDao.search(id);
      if(itemEntity != null){
         return new ItemDto(itemEntity.getCode(), itemEntity.getDesc(),
                    itemEntity.getPack(), itemEntity.getUnitPrize(),
                    itemEntity.getQoh());
      }
      return null;
    }

    @Override
    public ArrayList<ItemDto> getAllItems() throws Exception {
         ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
    ArrayList<ItemDto> itemDtos =new ArrayList<>();
   
        
       for( ItemEntity itemEntity :itemEntitys ){
       itemDtos.add(new ItemDto(
       itemEntity.getCode(),itemEntity.getDesc(),itemEntity.getPack(),itemEntity.getUnitPrize(),itemEntity.getQoh()
       ));
               
       }
       return itemDtos;
    } 



}
    
  

    
    


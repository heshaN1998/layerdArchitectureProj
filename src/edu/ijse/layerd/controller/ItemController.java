/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;
import java.util.ArrayList;
import edu.ijse.layerd.dto.ItemDto;
import edu.ijse.layerd.service.custom.ItemService;
import edu.ijse.layerd.service.ServiceFactory;


/**
 *
 * @author ACER
 */
public class ItemController {
    
    private ItemService itemService= (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    
    public String saveItem(ItemDto itemDto) throws Exception{
    return itemService.saveItem(itemDto);
    }
        public String updateItem(ItemDto itemDto) throws Exception{
    return itemService.updatetem(itemDto);
}
            public String deleteItem(String code) throws Exception{
    
    return itemService.deleteItem(code);
            }
                public String searchItem(String code) throws Exception{
                    return itemService.searchItem( code);
                }
                public  ArrayList<ItemDto> getAllItem() throws Exception{
                return itemService.getAllItems();
                }
                
}


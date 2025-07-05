/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;
import edu.ijse.layerd.dto.ItemDto;
import java.util.ArrayList;
import edu.ijse.layerd.service.SuperService;

/**
 *
 * @author ACER
 */
public interface ItemService extends SuperService{
   public String saveItem(ItemDto itemDto) throws Exception; 
      public String updatetem(ItemDto itemDto) throws Exception; 
            public String deleteItem(String id) throws Exception; 
               public String searchItem(String id) throws Exception;
               public ArrayList<ItemDto> getAllItems() throws Exception;
               
               
}

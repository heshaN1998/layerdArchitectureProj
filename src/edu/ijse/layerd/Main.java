/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.layerd;

import edu.ijse.layerd.db.DBConnection;
import java.sql.SQLException;
import edu.ijse.layerd.view.itemForm;
import edu.ijse.layerd.view.OrderForm;
import edu.ijse.layerd.dto.ItemDto;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)  {
        new itemForm().setVisible(true);
      //  new OrderForm().setVisible(true);
    }
    
}

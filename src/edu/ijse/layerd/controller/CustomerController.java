/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;

import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class CustomerController {
 private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
 
 public String savCustomer(CustomerDto customerDto) throws Exception{
 return customerService.saveCustomer(customerDto);
 }
 
 public String updateCustomer(CustomerDto customerDto) throws Exception{
 return customerService.updateCustomer(customerDto);
 }
 
 public String deleteCustomer(String code) throws Exception{
 return customerService.deleteCustomer(code);
 }
 
 public String searchCustomer(String code) throws Exception{
 return customerService.searchCustomer(code);
 }
 
 public ArrayList<CustomerDto>getAllCustomer() throws Exception{
 return customerService.getAllCustomer();
 }
 
}

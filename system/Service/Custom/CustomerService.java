/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.management.system.Service.Custom;

import java.util.ArrayList;
import library.management.system.Dto.BookDto;
import library.management.system.Dto.CustomerDto;
import library.management.system.Service.SuperService;

/**
 *
 * @author acer
 */
public interface CustomerService extends SuperService {
     String save(CustomerDto customerDto)throws Exception;
      String update(CustomerDto customerDto)throws Exception;
      String delete(String id)throws Exception;
      CustomerDto get(String id)throws Exception;
      ArrayList<CustomerDto>getAll()throws Exception;
}



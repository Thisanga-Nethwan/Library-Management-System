/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.management.system.Service.Custom;

import java.util.ArrayList;
import library.management.system.Dto.BookDto;
import library.management.system.Dto.BorrowingDto;
import library.management.system.Service.SuperService;

/**
 *
 * @author acer
 */
public interface BorrowingService extends SuperService {
    String save(BorrowingDto borrowingDto)throws Exception;
      String update(BorrowingDto borrowingDto)throws Exception;
      String delete(String id)throws Exception;
      BorrowingDto get(String id)throws Exception;
      ArrayList<BorrowingDto>getAll()throws Exception;
}



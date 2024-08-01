/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.management.system.Service.Custom;

import java.util.ArrayList;
import library.management.system.Dto.BookDto;
import library.management.system.Service.SuperService;

/**
 *
 * @author acer
 */
public interface BookService extends SuperService {
      String save(BookDto bookDto)throws Exception;
      String update(BookDto bookDto)throws Exception;
      String delete(String id)throws Exception;
      BookDto get(String id)throws Exception;
      ArrayList<BookDto>getAll()throws Exception;
}

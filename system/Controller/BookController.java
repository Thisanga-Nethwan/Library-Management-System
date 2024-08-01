/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Controller;

import java.util.ArrayList;
import library.management.system.Dto.BookDto;
import library.management.system.Service.Custom.BookService;
import library.management.system.Service.ServiceFactory;

/**
 *
 * @author acer
 */
public class BookController {
    private BookService bookService=(BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
    
    public String save(BookDto bookDto) throws Exception{
              return bookService.save(bookDto);
    }
     public String update(BookDto bookDto) throws Exception{
        return bookService.update(bookDto);
    }
      public String delete(String id) throws Exception{
        return bookService.delete(id);
    }
       public ArrayList<BookDto> getAll() throws Exception{
        return bookService.getAll();
    }
       public BookDto get(String id)throws Exception{
           return bookService.get(id);
       }
}

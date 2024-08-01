/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Service.Custom.Impl;

import java.util.ArrayList;
import library.management.system.Custom.BookDao;
import library.management.system.Dao.DaoFactory;
import library.management.system.Dto.BookDto;
import library.management.system.Entity.BookEntity;
import library.management.system.Service.Custom.BookService;

/**
 *
 * @author acer
 */
public class BookServiceImpl implements BookService{

    private BookDao bookDao=(BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOKS);
    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity entity=getBookEntity(bookDto);
      return bookDao.create(entity)?"Success":"Fail";
    }

    @Override
    public String update(BookDto bookDto) throws Exception {
       BookEntity entity=getBookEntity(bookDto);
       return bookDao.update(entity)?"Success":"Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        BookEntity entity=bookDao.get(id);
        return bookDao.delete(id)?"Success":"Fail";
    }

    @Override
    public BookDto get(String id) throws Exception {
        BookEntity entity=bookDao.get(id);
        if(entity!=null){
            return getBookDto(entity);
            
        }
        return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        if(bookEntitys != null && !bookEntitys.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for (BookEntity bookEntity : bookEntitys) {
                bookDtos.add(getBookDto(bookEntity));
            }
            
            return bookDtos;
        }
        return null;
    }

   private BookEntity getBookEntity(BookDto bookDto){
       return new BookEntity(
        bookDto.getAuthor(),
        bookDto.getCategoryid(),
        bookDto.getId(),
        bookDto.getIsbn(),                                                                                                                                                     
        bookDto.getTitle());
       
   }
    private BookDto getBookDto(BookEntity entity){
       return new BookDto(entity.getCategoryid(),
               entity.getId(),
               entity.getIsbn(),
               entity.getAuthor(),
               entity.getTitle());
               
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Custom;


import java.util.ArrayList;
import library.management.system.CrudUtil;
import library.management.system.Entity.BookEntity;
import java.sql.ResultSet;
/**
 *
 * @author acer
 */
public class BookDaoImpl implements  BookDao {

    @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("Insert INTO books VALUES(?,?,?,?,?)",t.getAuthor(),t.getCategoryid(),t.getId(),t.getIsbn(),t.getTitle());
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
       return CrudUtil.executeUpdate("UPDATE books SET  title = ?, author = ?, isbn= ?,categoryid=?, WHERE id = ?",
               t.getTitle(),t.getAuthor(),t.getIsbn(),t.getCategoryid(),t.getId() );
    }

    @Override
    public boolean delete(String id) throws Exception {
        
return CrudUtil.executeUpdate("DELETE FROM books WHERE id = ?", id);

    }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("DELETE FROM books WHERE id=?",id);
      if(rst.next()){
          BookEntity entity=new BookEntity(rst.getString("id"),
          rst.getString("title"),rst.getString("author"),rst.getString("isbn"),rst.getString("categoryid"));
          return entity;
          
      }
    return null;}

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntity=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT *FROM books");
        while (rst.next()){
            BookEntity entity=new BookEntity(rst.getString("id"),rst.getString("author"),rst.getString("categoryid"),rst.getString("isbn"),rst.getString("title"));
            bookEntity.add(entity);
        }
        return bookEntity;
        }
    
} 

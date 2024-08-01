/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Custom;

import java.util.ArrayList;
import library.management.system.Entity.BorrowingEntity;
import java.sql.ResultSet;
import library.management.system.CrudUtil;

/**
 *
 * @author acer
 */


public class BorrowingDaoImpl implements BorrowingDao {

    @Override
    public boolean create(BorrowingEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO borrowings (?,?,?,?,?,?,?)",t.getBookid(),t.getBorrowdate(),t.getDuedate(),t.getFine(),t.getId(),t.getMemberid(),t.getReturndate());
    }

    @Override
    public boolean update(BorrowingEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE borrowings SET borrow_date=? ,due_date=?,return_date=?,fine=?  WHERE id=?",t.getBorrowdate(),t.getDuedate(),t.getReturndate(),t.getFine());
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM borrowings WHERE id=?",id);
    }

    @Override
    public BorrowingEntity get(String id) throws Exception {
      ResultSet rst=CrudUtil.executeQuery("SELECT FROM borrowings WHERE id=? ",id);
      if(rst.next()){
          BorrowingEntity entity=new BorrowingEntity(
          rst.getString("id"),rst.getString("book_id "),rst.getString("member_id"),rst.getString("borrow_date"),rst.getString("due_date"),rst.getString("return_date"),rst.getInt("fine"));
          return entity;
      }
      return null;
    }

    @Override
    public ArrayList<BorrowingEntity> getAll() throws Exception {
         ArrayList<BorrowingEntity> borrowingEntity=new ArrayList<>();
ResultSet rst=CrudUtil.executeQuery("SELECT *FROM  borrowings");
        while (rst.next()){
            BorrowingEntity entity=new BorrowingEntity(rst.getString("id"),rst.getString("member_id "),rst.getString(" book_id "),rst.getString(" borrow_date "),rst.getString("due_date"),rst.getString("return_date"),rst.getInt("fine"));
            borrowingEntity.add(entity);
        }
        return borrowingEntity;
        }
}
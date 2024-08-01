/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Custom;

/**
 *
 * @author acer
 */

import java.util.ArrayList;
import library.management.system.CrudUtil;
import library.management.system.Entity.CustomerEntity;
import java.sql.ResultSet;
import library.management.system.Custom.CustomerDao;

public class CustomerDAOImpl implements CustomerDao {

    @Override
    public boolean create(CustomerEntity t) throws Exception {
                return CrudUtil.executeUpdate("INSER INTO  customers  VALUES (?, ?,?,?)",t.getId(),t.getName(),t.getContact() );
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET contact_info =?,name=?  WHERE id=? ",t.getContact(),t.getName()) ;
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM customers WHERE id = ?", id);
    }
    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT *FROM customers WHERE id= ? ",id);
        if(rst.next()){
            CustomerEntity customerEntity=new CustomerEntity(
            rst.getString("id"),
            rst.getString("name"),
         rst.getInt("contact_info" ));
       
        return customerEntity;
        }
        return null;
    }
    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntity=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT *FROM customers");
        while (rst.next()){
           CustomerEntity entity=new CustomerEntity(rst.getString("id"),rst.getString("name"),rst.getInt("contact_info"));
            customerEntity.add(entity);
        }
        return customerEntity;
        }

    }
    
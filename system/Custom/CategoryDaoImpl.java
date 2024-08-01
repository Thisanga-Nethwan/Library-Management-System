/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Custom;

import java.util.ArrayList;
import library.management.system.Entity.CategoryEntity;
import library.management.system.CrudUtil;
import java.sql.ResultSet;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean create(CategoryEntity t) throws Exception {
      return CrudUtil.executeUpdate("INSER INTO  categories  VALUES (?, ?,?)",t.getCategoryid(),t.getName(),t.getDescription());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE  categories SET name=?,description=? WHERE id=?",t.getName(),t.getDescription());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM categories WHERE id = ?", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT *FROM categories WHERE id=?", id);
        if(rst.next()){
           
CategoryEntity entity=new CategoryEntity(rst.getString("id"),
          rst.getString("name"),rst.getString("decription"));
          return entity;

        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
           ArrayList<CategoryEntity> categoryEntity=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT *FROM  categories");
        while (rst.next()){
           CategoryEntity entity=new CategoryEntity(rst.getString("id"),rst.getString("name"),rst.getString("description"));
            categoryEntity.add(entity);
        }
        return categoryEntity;
        }


    
}

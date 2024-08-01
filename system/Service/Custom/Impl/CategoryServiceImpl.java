/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Service.Custom.Impl;

import java.util.ArrayList;
import library.management.system.Custom.CategoryDao;
import library.management.system.Dao.DaoFactory;
import library.management.system.Dto.CategoryDto;
import library.management.system.Entity.CategoryEntity;
import library.management.system.Service.Custom.CategoryService;

/**
 *
 * @author acer
 */
public class CategoryServiceImpl implements CategoryService {

private CategoryDao categoryDao=(CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORIES);   
    @Override
    public String save(CategoryDto categoryDto) throws Exception {
       CategoryEntity entity=getCategoryEntity(categoryDto);
              return categoryDao.create(entity)?"SUCCES":"FAIL";
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
       CategoryEntity entity=getCategoryEntity(categoryDto);
      return categoryDao.update(entity)?"Success":"Fail";
    }
    @Override
    public String delete(String id) throws Exception {
        CategoryEntity entity=categoryDao.get(id);
        return categoryDao.delete(id)?"Success":"Fail";

    }
    @Override
    public CategoryDto get(String id) throws Exception {
        CategoryEntity entity=categoryDao.get(id);
        if(entity!=null){
            return getCategoryDto(entity);
            
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
         ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
        if(categoryEntitys != null && !categoryEntitys.isEmpty()){
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
            for (CategoryEntity categoryEntity : categoryEntitys) {
                categoryDtos.add(getCategoryDto(categoryEntity));
            }
            
            return categoryDtos;
        }
        return null;
    }
   private CategoryEntity getCategoryEntity(CategoryDto categoryDto){
       return new CategoryEntity(
       categoryDto.getCategoryid(),
       categoryDto.getDescription(),
       categoryDto.getName());
   } 
   private CategoryDto getCategoryDto(CategoryEntity entity){
       return new CategoryDto(entity.getCategoryid(),
       entity.getDescription(),entity.getName());
       
   }
}

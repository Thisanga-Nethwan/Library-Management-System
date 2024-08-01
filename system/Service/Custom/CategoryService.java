/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.management.system.Service.Custom;

import java.util.ArrayList;
import library.management.system.Dto.BookDto;
import library.management.system.Dto.CategoryDto;
import library.management.system.Service.SuperService;

/**
 *
 * @author acer
 */
public interface CategoryService extends SuperService {
   String save(CategoryDto categoryDto)throws Exception;
      String update(CategoryDto categoryDto)throws Exception;
      String delete(String id)throws Exception;
      CategoryDto get(String id)throws Exception;
      ArrayList<CategoryDto>getAll()throws Exception;
}


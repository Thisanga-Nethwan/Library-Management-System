/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Controller;

import library.management.system.Service.Custom.CategoryService;
import library.management.system.Service.ServiceFactory;

/**
 *
 * @author acer
 */
public class Categories {
    
private CategoryService categoryService=(CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORIES);

}

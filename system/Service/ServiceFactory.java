/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Service;

import library.management.system.Service.Custom.Impl.BookServiceImpl;
import library.management.system.Service.Custom.Impl.BorrowingServiceImpl;
import library.management.system.Service.Custom.Impl.CategoryServiceImpl;
import library.management.system.Service.Custom.Impl.CustomerServiceImpl;

/**
 *
 * @author acer
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory ==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch(serviceType){
            case BOOK:
                 return new BookServiceImpl();
                  case CUSTOMERS:
                 return new CustomerServiceImpl();
                  case BORROWINGS:
                 return new BorrowingServiceImpl();
                  case CATEGORIES:
                 return new CategoryServiceImpl();
            default:
                return null;
        }
    }
    public enum ServiceType{
        BOOK,CUSTOMERS,BORROWINGS,CATEGORIES;
    }
    
}

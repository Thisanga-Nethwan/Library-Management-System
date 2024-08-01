/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Dao;

import library.management.system.Custom.BookDaoImpl;

/**
 *
 * @author acer
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
        switch(type){
            case BOOKS:
                return new BookDaoImpl();
                default:
                return null;
        }
    }
    public enum DaoTypes{
        BOOKS,BORROWINGS,CUSTOMERS,CATEGORIES;
    }
}

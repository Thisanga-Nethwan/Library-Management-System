/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Service.Custom.Impl;

import java.util.ArrayList;
import library.management.system.Custom.BorrowingDao;
import library.management.system.Dao.DaoFactory;
import library.management.system.Dto.BorrowingDto;
import library.management.system.Entity.BorrowingEntity;
import library.management.system.Service.Custom.BorrowingService;

/**
 *
 * @author acer
 */
public class BorrowingServiceImpl implements BorrowingService {
   private BorrowingDao borrowingDao=(BorrowingDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROWINGS);
    @Override
    public String save(BorrowingDto borrowingDto) throws Exception {
               BorrowingEntity entity=getBorrowingEntity(borrowingDto);
      return borrowingDao.create(entity)?"Success":"Fail";
    }

    @Override
    public String update(BorrowingDto borrowingDto) throws Exception {
                       BorrowingEntity entity=getBorrowingEntity(borrowingDto);
       return borrowingDao.update(entity)?"Success":"Fail";
    }

    @Override
    public String delete(String id) throws Exception {
         BorrowingEntity entity=borrowingDao.get(id);
        return borrowingDao.delete(id)?"Success":"Fail";
    }

    @Override
    public BorrowingDto get(String id) throws Exception {
        BorrowingEntity entity=borrowingDao.get(id);
        if(entity!=null){
            return getBorrowingDto(entity);
            
        }
        return null;
    }

    @Override
    public ArrayList<BorrowingDto> getAll() throws Exception {
       ArrayList<BorrowingEntity> borrowingEntitys = borrowingDao.getAll();
        if(borrowingEntitys != null && !borrowingEntitys.isEmpty()){
            ArrayList<BorrowingDto> bookDtos = new ArrayList<>();
            
            for (BorrowingEntity bookEntity : borrowingEntitys) {
                bookDtos.add(getBorrowingDto(bookEntity));
            }
            
            return bookDtos;
        }
        return null;
    }

    
    private BorrowingEntity getBorrowingEntity(BorrowingDto borrowingDto){
        return new BorrowingEntity(
        borrowingDto.getBookid(),
        borrowingDto.getBorrowdate(),
        borrowingDto.getDuedate(),
        borrowingDto.getMemberid(),
        borrowingDto.getReturndate());
    }
    private BorrowingDto getBorrowingDto(BorrowingEntity entity){
     return new BorrowingDto(entity.getBookid(),
     entity.getBorrowdate(),entity.getDuedate(),entity.getId(),entity.getMemberid(),entity.getReturndate());   
    }
}

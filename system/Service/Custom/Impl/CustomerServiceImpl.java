/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Service.Custom.Impl;

import java.util.ArrayList;
import library.management.system.Custom.CustomerDao;
import library.management.system.Dao.DaoFactory;
import library.management.system.Dto.CustomerDto;
import library.management.system.Entity.CustomerEntity;
import library.management.system.Service.Custom.CustomerService;

/**
 *
 * @author acer
 */
public class CustomerServiceImpl implements CustomerService {
  private CustomerDao customerDao=(CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMERS);
    @Override
    public String save(CustomerDto customerDto) throws Exception {
       CustomerEntity entity=getCustomerEntity(customerDto);
       return customerDao.create(entity)?"SUCCESS":"FAIL";
    }

    @Override
    public String update(CustomerDto customerDto) throws Exception {
        CustomerEntity entity=getCustomerEntity(customerDto);
        return customerDao.update(entity)?"SUCCESS":"FAIL";
    }

    @Override
    public String delete(String id) throws Exception {
       CustomerEntity entity=customerDao.get(id);
       return customerDao.delete(id)?"SUCCESS":"FAIL";
    }

    @Override
    public CustomerDto get(String id) throws Exception {
       CustomerEntity entity=customerDao.get(id);
       if(entity!=null){
           return getCustomerDto(entity);
       }
       return null;
    }

    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {
       ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        if(customerEntitys != null && !customerEntitys.isEmpty()){
            ArrayList<CustomerDto> customerDtos = new ArrayList<>();
            for (CustomerEntity customerEntity : customerEntitys) {
                customerDtos.add(getCustomerDto(customerEntity));
            }
            
            return customerDtos;
        }
        return null;
    }

private CustomerEntity getCustomerEntity(CustomerDto customerDto){
    return new CustomerEntity(
    customerDto.getId(),
    customerDto.getName(),
    customerDto.getContact());
}
  private CustomerDto getCustomerDto(CustomerEntity entity){
      return new CustomerDto(
      entity.getId(),
      entity.getName(),
      entity.getContact());
  }
}

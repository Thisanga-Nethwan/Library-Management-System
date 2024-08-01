/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Controller;

import library.management.system.Service.Custom.CustomerService;
import library.management.system.Service.ServiceFactory;

/**
 *
 * @author acer
 */
public class CustomerController {
    private CustomerService customerService=(CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMERS);
}
  
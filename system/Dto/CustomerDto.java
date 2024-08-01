/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Dto;

/**
 *
 * @author acer
 */
public class CustomerDto {
      private String id;
      private String name;
      private Integer Contact;

    public CustomerDto() {
    }

    public CustomerDto(String id, String name, Integer Contact) {
        this.id = id;
        this.name = name;
        this.Contact = Contact;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Contact
     */
    public Integer getContact() {
        return Contact;
    }

    /**
     * @param Contact the Contact to set
     */
    public void setContact(Integer Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", Contact=" + Contact + '}';
    }

 
      
      
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Entity;

/**
 *
 * @author acer
 */
public class CustomerEntity {
    private String id;
    private String name;
    private Integer contact;

    public CustomerEntity() {
    }

    public CustomerEntity(String id, String name, Integer contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
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
     * @return the contact
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "id=" + id + ", name=" + name + ", contact=" + contact + '}';
    }
    
    
}

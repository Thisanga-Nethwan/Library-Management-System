/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.Dto;

/**
 *
 * @author acer
 */
public class BorrowingDto {
    private String id;
    private String bookid;
    private String memberid;
    private String borrowdate;
    private String duedate;
    private String returndate;
    private Integer fine;

    public BorrowingDto(String bookid1, String borrowdate1, String duedate1, String id1, String memberid1, String returndate1) {
    }

    public BorrowingDto(String id, String bookid, String memberid, String borrowdate, String duedate, String returndate, Integer fine) {
        this.id = id;
        this.bookid = bookid;
        this.memberid = memberid;
        this.borrowdate = borrowdate;
        this.duedate = duedate;
        this.returndate = returndate;
        this.fine = fine;
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
     * @return the bookid
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * @param bookid the bookid to set
     */
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    /**
     * @return the memberid
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * @param memberid the memberid to set
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    /**
     * @return the borrowdate
     */
    public String getBorrowdate() {
        return borrowdate;
    }

    /**
     * @param borrowdate the borrowdate to set
     */
    public void setBorrowdate(String borrowdate) {
        this.borrowdate = borrowdate;
    }

    /**
     * @return the duedate
     */
    public String getDuedate() {
        return duedate;
    }

    /**
     * @param duedate the duedate to set
     */
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    /**
     * @return the returndate
     */
    public String getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the fine
     */
    public Integer getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Integer fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Borrowings{" + "id=" + id + ", bookid=" + bookid + ", memberid=" + memberid + ", borrowdate=" + borrowdate + ", duedate=" + duedate + ", returndate=" + returndate + ", fine=" + fine + '}';
    }
    
    
}

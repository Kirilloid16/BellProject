package ru.lukah.bellproject.Model;

import javax.persistence.*;

@Entity
@Table(name = "UserDocument")
public class UserDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userId")
    private int userId;
    @Column(name = "docTypeId")
    private int docTyprId;
    @Column(name = "docNumber")
    private String docNumber;
    @Column(name = "docDate")
    private String docDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDocTyprId() {
        return docTyprId;
    }

    public void setDocTyprId(int docTyprId) {
        this.docTyprId = docTyprId;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

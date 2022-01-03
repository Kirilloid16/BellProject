package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UserDocument")
public class UserDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userId", nullable = false)
    private int userId;
    @Column(name = "docNumber")
    private String docNumber;
    @Column(name = "docDate")
    private String docDate;
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "userDocId")
    private DocumentType documentType;


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

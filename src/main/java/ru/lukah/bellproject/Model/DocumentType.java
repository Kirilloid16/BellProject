package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Document")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "userDocId")
    private int userDocId;
    @Column(name = "docCode")
    private String docCode;
    @Column(name = "docName")
    private String docName;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }


}

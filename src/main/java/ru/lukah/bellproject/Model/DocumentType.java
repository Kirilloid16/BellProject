package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "documentType")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
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

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", docCode='" + docCode + '\'' +
                ", docName='" + docName + '\'' +
                '}';
    }
}

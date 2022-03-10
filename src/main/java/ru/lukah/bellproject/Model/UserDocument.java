package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_document")
public class UserDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "doc_type_id")
    private DocumentType docTypeId;
    @Column(name = "doc_number")
    private String docNumber;
    @Column(name = "doc_date")
    private String docDate;
    public UserDocument() {
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

    @Override
    public String toString() {
        return "UserDocument{" +
                "id=" + id +
                ", docTypeId=" + docTypeId +
                ", docNumber='" + docNumber + '\'' +
                ", docDate='" + docDate + '\'' +
                '}';
    }
}

package florian.bauge.demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.Date;

public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


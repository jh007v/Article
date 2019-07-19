package com.list.demo.entity;

import org.hibernate.annotations.DynamicInsert;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "board")
@DynamicInsert
public class article {

    @Id
    @Column(name = "no", updatable = false, nullable = false)
    private String no;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "cre_date")
    private Date credate;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCredate() {
        return credate;
    }

    public void setCredate(Date credate) {
        this.credate = credate;
    }
}

package com.jerry.springboot_jpa_test.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Setter
@Getter
public class BaseEntity {
    @Id
    @GenericGenerator(name = "uuid",strategy = "uuid")
    protected String id;
    @Column(name = "create_date")
    Date createDate=new Date();
    @Column(name = "update_date")
    Date updateDate;
}

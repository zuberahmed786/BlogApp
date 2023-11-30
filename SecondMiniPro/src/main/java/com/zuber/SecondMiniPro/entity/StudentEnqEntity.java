package com.zuber.SecondMiniPro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "studentEnqDetails")
public class StudentEnqEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer enquiryId;
    private String studentName;
    private String studentPhone;
    private String studentClassMode;
    private String courseName;
    private String enquiryStatus;
    private Date createdDate;
    private Date updatedDate;
    private Integer userId;
}

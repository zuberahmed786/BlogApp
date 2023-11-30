package com.zuber.SecondMiniPro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "courseDetails")
public class CourseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;
    private String courseName;
}

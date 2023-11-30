package com.zuber.SecondMiniPro.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "enquiryStatus")
public class EnqStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer statusId;
    private String statusName;


}

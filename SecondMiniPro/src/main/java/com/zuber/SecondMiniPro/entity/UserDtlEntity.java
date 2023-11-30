package com.zuber.SecondMiniPro.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "userdetails")
public class UserDtlEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String  userName;
    private String userEmail;
    private String userPhone;
    private String userPsw;
    private String userStatus;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<StudentEnqEntity> enquiries;

}

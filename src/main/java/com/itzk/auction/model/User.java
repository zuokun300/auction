package com.itzk.auction.model;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String uName;

    private String uPass;

    private String uGender;

    private Integer gId;

}
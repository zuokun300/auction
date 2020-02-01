package com.itzk.auction.model;

import lombok.Data;

import java.util.Date;

@Data
public class Goods {
    private Long gId;

    private String gName;

    private Double gLowprice;

    private Double gLastprice;

    private String gType;

    private String gImg;

    private Date gTime;

    private Boolean gState;

    private Integer uId;


}
package com.example.demo.store;


import lombok.Getter;

@Getter
public enum Code {
    WOOWA_SISTERS("우아한자매들","w01","s0001"),
    WOOWA_CHILDREN("우아한아이들","w02","s0099"),
    WOOWA_ADULT("우아한어른들","w03","s1201");
    private String viewName;
    private String companyCode;
    private String bizTypeCode;

    Code(String viewName, String companyCode, String bizTypeCode) {
        this.viewName = viewName;
        this.companyCode = companyCode;
        this.bizTypeCode = bizTypeCode;
    }
}

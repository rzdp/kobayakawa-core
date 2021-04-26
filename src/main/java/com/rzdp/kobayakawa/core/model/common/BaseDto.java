package com.rzdp.kobayakawa.core.model.common;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDto {

    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

}

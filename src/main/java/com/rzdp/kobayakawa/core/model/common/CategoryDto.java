package com.rzdp.kobayakawa.core.model.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({ "id", "name" })
public class CategoryDto extends BaseDto {

    private Long id;
    private String name;

}

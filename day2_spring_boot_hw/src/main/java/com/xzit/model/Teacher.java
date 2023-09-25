package com.xzit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "教师对象", description = "教师对象，对应数据库表teacher")
public class Teacher {
    @ApiModelProperty(value = "教师id", required = true, example = "1")
    private int id;
    @ApiModelProperty(value = "教师姓名", required = true, example = "李四")
    private String name;
    @ApiModelProperty(value = "教师年龄", required = true, example = "40")
    private int age;
    @ApiModelProperty(value = "教师性别", required = false, example = "男")
    private String gender;
}

package com.xzit.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("员工信息")
public class Emp {
    @ApiModelProperty("员工id")
    private Integer id;
    @ApiModelProperty("员工姓名")
    private String name;
    @ApiModelProperty("员工地址")
    private String addr;
    @ApiModelProperty("员工部门")
    private String dept;
    @ApiModelProperty("员工年龄")
    private Integer age;
}

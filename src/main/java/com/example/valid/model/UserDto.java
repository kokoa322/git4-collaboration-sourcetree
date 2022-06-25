package com.example.valid.model;


import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;

@ToString
public class UserDto {

    @NotNull(message = "번호를 입력해주세요")
    private long no;

    @NotNull(message = "이름을 입력해주세요")
    private String name;

    @Min(value = 5000, message = "금액은 5000원이상이여야 합니다") // 5000원 보다 같거나, 크면 통과
    private long Amt;

}

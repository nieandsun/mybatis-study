package com.nrsc.pagehelperstudy.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TJobHistory {
    private Long id;

    private Long userId;

    private String companyName;

    private Integer years;

    private String title;

}

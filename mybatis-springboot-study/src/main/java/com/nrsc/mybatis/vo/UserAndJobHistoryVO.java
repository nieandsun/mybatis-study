package com.nrsc.mybatis.vo;

import com.nrsc.mybatis.domian.TJobHistory;
import com.nrsc.mybatis.domian.TUser;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserAndJobHistoryVO extends TUser {
    private List<TJobHistory> jobHistoryList;
}

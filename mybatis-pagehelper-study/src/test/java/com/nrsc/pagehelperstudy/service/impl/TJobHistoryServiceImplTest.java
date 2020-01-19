package com.nrsc.pagehelperstudy.service.impl;

import com.nrsc.pagehelperstudy.domian.TJobHistory;
import com.nrsc.pagehelperstudy.service.TJobHistoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class TJobHistoryServiceImplTest {

    @Autowired
    private TJobHistoryService jobHistoryService;
    @Test
    void selectJobHistory() {
        List<TJobHistory> tJobHistories = jobHistoryService.selectJobHistory();
        for (TJobHistory jobHistory : tJobHistories) {
            System.out.println(jobHistory);
        }
    }

    @Test
    void selectJobHistory1() {
        List<TJobHistory> tJobHistories = jobHistoryService.selectJobHistory1();
        for (TJobHistory jobHistory : tJobHistories) {
            System.out.println(jobHistory);
        }
    }

    @Test
    void selectJobHistory2() {
        List<TJobHistory> tJobHistories = jobHistoryService.selectJobHistory2();
        for (TJobHistory jobHistory : tJobHistories) {
            System.out.println(jobHistory);
        }
    }
}
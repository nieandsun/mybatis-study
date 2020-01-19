package com.nrsc.pagehelperstudy.controller;

import com.nrsc.pagehelperstudy.domian.TJobHistory;
import com.nrsc.pagehelperstudy.service.TJobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobHistory")
public class TJobHistoryServiceController {
    @Autowired
    private TJobHistoryService jobHistoryService;

    @GetMapping(value = "/select", name = "查询工作历史数据")
    public List<TJobHistory> selectJobHistory() {
        return jobHistoryService.selectJobHistory();
    }
}

package com.nrsc.pagehelperstudy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nrsc.pagehelperstudy.domian.TJobHistory;
import com.nrsc.pagehelperstudy.mapper.TJobHistoryMapper;
import com.nrsc.pagehelperstudy.service.TJobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TJobHistoryServiceImpl implements TJobHistoryService {
    @Autowired
    private TJobHistoryMapper jobHistoryMapper;

    /****
     * 使用Page对象
     * @return
     */
    @Override
    public List<TJobHistory> selectJobHistory() {
        //指定当前页和每页显示的个数
        Page<Object> page = PageHelper.startPage(2, 3);
        List<TJobHistory> tJobHistories = jobHistoryMapper.selectJobHistory();
        System.err.println("当前页码：" + page.getPageNum());
        System.err.println("总记录数：" + page.getTotal());
        System.err.println("当前页的记录数：" + page.getPageSize());
        System.err.println("总页码：" + page.getPages());
        //等等
        return tJobHistories;
    }

    /***
     * 使用PageInfo对象 --- 可以获取更加详细的分页信息
     * @return
     */
    public List<TJobHistory> selectJobHistory1() {

        PageHelper.startPage(1, 3);
        List<TJobHistory> tJobHistories = jobHistoryMapper.selectJobHistory();
        PageInfo<TJobHistory> info = new PageInfo<>(tJobHistories);
        System.err.println("当前页码：" + info.getPageNum());
        System.err.println("总记录数：" + info.getTotal());
        System.err.println("当前页的记录数：" + info.getPageSize());
        System.err.println("总页码：" + info.getPages());

        System.err.println("是否为第一页：" + info.isIsFirstPage());
        System.err.println("是否为最后一页：" + info.isIsLastPage());
        System.err.println("是否还有下一页：" + info.isHasNextPage());
        //等等
        return tJobHistories;
    }

    /****
     * 使用PageInfo对象 --- 构造函数为PageInfo(List<T> list, int navigatePages)
     * navigatePages:  连续显示的页面
     *    比如navigatePages=3
     *       看第一页时，页码展示为 1,2,3
     *       看第二页时，页码展示为 1,2,3
     *       看第三页时，页码展示为 2,3,4
     *       看第四页时，页码展示为 3,4,5
     *  我们项目里该功能其实是用前端组件完成的。。。。。
     * @return
     */
    public List<TJobHistory> selectJobHistory2() {
        int pageNum = 4;
        int pageSize = 1;
        PageHelper.startPage(pageNum, pageSize);
        List<TJobHistory> tJobHistories = jobHistoryMapper.selectJobHistory();

        PageInfo<TJobHistory> info = new PageInfo<>(tJobHistories, 3);

        System.err.println("当前页码：" + info.getPageNum());
        System.err.println("总记录数：" + info.getTotal());
        System.err.println("当前页的记录数：" + info.getPageSize());
        System.err.println("总页码：" + info.getPages());

        System.err.println("是否为第一页：" + info.isIsFirstPage());
        System.err.println("是否为最后一页：" + info.isIsLastPage());
        System.err.println("是否还有下一页：" + info.isHasNextPage());

        int[] navigatepageNums = info.getNavigatepageNums();
        System.err.println("看第" + pageNum + "页时,展示的页码为：" );
        for (int num : navigatepageNums) {
            System.err.println(num);
        }

        return tJobHistories;
    }

}

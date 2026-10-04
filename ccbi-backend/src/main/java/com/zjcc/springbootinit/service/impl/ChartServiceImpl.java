package com.zjcc.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjcc.springbootinit.model.entity.Chart;
import com.zjcc.springbootinit.mapper.ChartMapper;
import com.zjcc.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
* @author 86187
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2026-10-03 16:15:41
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}





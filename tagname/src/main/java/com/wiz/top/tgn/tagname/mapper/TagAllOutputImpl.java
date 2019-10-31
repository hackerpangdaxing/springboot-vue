package com.wiz.top.tgn.tagname.mapper;

import com.wiz.top.tgn.tagname.dao.TagAllOutputDao;
import com.wiz.top.tgn.tagname.service.TagAllOutputService;
import com.wiz.top.tgn.tagname.vo.TagAllOutput;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * 接口实现类
 *
 * @author linfengda
 * @create 2019-9-16
 * @since 1.0.0
 */
@Service
public class TagAllOutputImpl implements TagAllOutputService {

    @Resource
    TagAllOutputDao tagAllOutputDao;
    
    /**
     * @author linfengda
     * @deprecated 主要是反馈所有测点ID及测点转换接口
     */
    @Override
    public List<TagAllOutput> getTagAllOutput() {
        return tagAllOutputDao.getTagAllOutput();
    }
}
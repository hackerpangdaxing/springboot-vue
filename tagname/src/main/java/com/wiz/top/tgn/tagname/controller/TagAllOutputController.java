package com.wiz.top.tgn.tagname.controller;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wiz.top.tgn.tagname.dao.TagAllOutputDao;
import com.wiz.top.tgn.tagname.service.TagAllOutputService;
import com.wiz.top.tgn.tagname.vo.TagAllOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * 〈进行测点反馈〉<br>
 * 〈〉
 *
 * @author linfengda
 * @create 2019-9-16
 * @since 1.0.0
 */
@Controller
public class TagAllOutputController {
	@Autowired
	TagAllOutputService tagAllOutputService;


	/**
	 * @author linfengda
	 * @deprecated 主要是反馈所有测点ID及测点转换接口
	 * @return {"tagid":190018,"tagCode":"#1a17.UNIT1@NET1"}
	 */
	@GetMapping(value = "/getTagAllOutput")
	public List<TagAllOutput> getTagAllOutput() {
		return tagAllOutputService.getTagAllOutput();
	}

	/**
	 * 功能描述: <br>
	 * 〈初始化页面〉
	 *
	 * @return:
	 * @since: 1.0.0
	 * @Author:
	 * @Date:  
	 */
	@GetMapping("test")
	public ModelAndView TestDemo(){

		System.out.print("----------------index---------------------");

		return  new ModelAndView("index");
	}

    @CrossOrigin
	@RequestMapping("page")
	@ResponseBody
	public PageInfo<TagAllOutput> queryKeywords(@RequestParam(defaultValue="1") int pageNum,
												@RequestParam(defaultValue="3") int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<TagAllOutput> list= tagAllOutputService.getTagAllOutput();
		PageInfo<TagAllOutput> pageInfo = new PageInfo<TagAllOutput>(list);
		return pageInfo;
	}
}
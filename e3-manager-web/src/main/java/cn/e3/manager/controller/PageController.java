package cn.e3.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	/**
	 * 需求:后台系统页面跳转
	 * 请求 localhost:8081/{}
	 */
	@RequestMapping("{page}")
	public String toPage(@PathVariable String page){
		return page;
	}
}

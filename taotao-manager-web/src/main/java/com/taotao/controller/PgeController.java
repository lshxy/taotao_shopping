package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * 测试商品列表展示页面
 * @author 10205
 *
 */
@Controller
public class PgeController {
	@RequestMapping("/")
	public String showIndex()
	{
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page)
	{
		return page;
	}
}

package com.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示页面
 * @author 10205
 *
 */
@Controller
public class PageController {
	
	
	
	/**
	 * 展示首页
	 * @return
	 */
	//接收URL的请求http://localhost:8082/index.html
	@RequestMapping("/index")
	public String showIndex(){
		return "index";//响应jsp
	}
}

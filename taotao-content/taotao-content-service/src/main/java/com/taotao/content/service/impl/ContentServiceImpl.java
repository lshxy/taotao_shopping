package com.taotao.content.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.util.JsonUtils;
import com.taotao.content.service.ContentService;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper mapper;
	
	@Override
	public TaotaoResult saveContent(TbContent content) {
		//1.注入mapper
		
		//2.补全其他的属性
		content.setCreated(new Date());
		content.setUpdated(content.getCreated());
		//3.插入内容表中
		mapper.insertSelective(content);
		return TaotaoResult.ok();
	}
	@Override
	public List<TbContent> getContentListByCatId(Long categoryId) {
		
		
		
		
		//1.注入mapper
		//2.创建example
		TbContentExample example = new TbContentExample();
		//3.设置查询的条件
		example.createCriteria().andCategoryIdEqualTo(categoryId);//select × from tbcontent where category_id=1
		//4.执行查询
		List<TbContent> list = mapper.selectByExample(example);
		//返回	
		
		return list;
	}
}

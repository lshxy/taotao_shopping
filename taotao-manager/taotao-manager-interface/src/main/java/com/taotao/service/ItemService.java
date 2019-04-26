package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
/**
 * 商品相关处理
 * @author 10205
 *
 */
public interface ItemService {
	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIDataGridResult getItemList(Integer page,Integer rows);
}

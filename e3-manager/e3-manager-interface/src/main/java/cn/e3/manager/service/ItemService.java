package cn.e3.manager.service;

import cn.e3.manager.pojo.TbItem;
import cn.e3.utils.DatagridPageBean;

public interface ItemService {
	
	/**
	 *需求:根据id查询商品
	 */
	public TbItem findItemByID(Long itemId);
	
	/**
	 * 需求:分页查询商品
	 */
	public DatagridPageBean findItemByPage(Integer page, Integer rows);

}

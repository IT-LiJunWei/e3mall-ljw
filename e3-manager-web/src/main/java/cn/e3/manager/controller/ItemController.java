package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.pojo.TbItem;
import cn.e3.manager.service.ItemService;
import cn.e3.utils.DatagridPageBean;

@Controller
public class ItemController {

	//注入service
	@Autowired
	private ItemService itemService;

	/**
	* 需求:根据id查询
	*/
	@RequestMapping("item/list/{itemId}")
	@ResponseBody
	public TbItem findItemByID(@PathVariable Long itemId){
		return itemService.findItemByID(itemId);
	}
	
	/**
	 * 需求:分页查询商品
	 */
	@RequestMapping("item/list")
	@ResponseBody
	public DatagridPageBean findItemListByPage(Integer page,Integer rows){
		return itemService.findItemByPage(page, rows);
	}
}

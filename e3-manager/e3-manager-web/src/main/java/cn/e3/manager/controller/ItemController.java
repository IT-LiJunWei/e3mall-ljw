package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.pojo.TbItem;
import cn.e3.manager.service.ItemService;

@Controller
public class ItemController {

	//ע��service�������
	@Autowired
	private ItemService itemService;

	/**
	* ����:����id��ѯ��Ʒ����
	* ����:item/list/{itemId}
	*/
	@RequestMapping("item/list/{itemId}")
	@ResponseBody
	public TbItem findItemByID(@PathVariable Long itemId){
		//����service���񷽷�
		TbItem item = itemService.findItemByID(itemId);
		return item;
	}
}

package cn.e3.manager.service;

import cn.e3.manager.pojo.TbItem;

public interface ItemService {
	
	/**
	 * ����:����id��ѯ��Ʒ����
	 */
	public TbItem findItemByID(Long itemId);

}

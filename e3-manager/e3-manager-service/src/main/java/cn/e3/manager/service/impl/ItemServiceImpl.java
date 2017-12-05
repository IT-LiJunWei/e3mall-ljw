package cn.e3.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3.manager.mapper.TbItemMapper;
import cn.e3.manager.pojo.TbItem;
import cn.e3.manager.pojo.TbItemExample;
import cn.e3.manager.service.ItemService;
import cn.e3.utils.DatagridPageBean;
@Service
public class ItemServiceImpl implements ItemService {
	
	//注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;

	/**
	 * 需求:根据id查询商品数据
	 */
	public TbItem findItemByID(Long itemId) {
		// 根据主键查询商品数据
		return itemMapper.selectByPrimaryKey(itemId);
	}

	/**
	 * 需求:分页查询商品
	 */
	@Override
	public DatagridPageBean findItemByPage(Integer page, Integer rows) {
		
		TbItemExample example = new TbItemExample();
		//在查询前设置分页
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建DatagridPageBean分装分页
		DatagridPageBean pageBean = new DatagridPageBean();
		pageBean.setRows(list);
		//查询总记录数
		PageInfo<TbItem> pageinfo = new PageInfo<>(list);
		pageBean.setTotal(pageinfo.getTotal());
		return pageBean;
	}

}

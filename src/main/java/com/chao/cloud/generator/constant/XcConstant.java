package com.chao.cloud.generator.constant;

import java.util.List;

import cn.hutool.core.collection.CollUtil;

/**
 * 
 * @功能：常量
 * @author： 南帅
 * @version 1.0.2
 */
public interface XcConstant {

	List<String> ADMIN_USER_NAME = CollUtil.toList("xuechao");

	String ADMIN_MENU = "<a link=\"/xc/user\" href=\"javascript:;\">用户管理</a>";

	Integer TOP_ID = 0;

	String TOP_ICON = "layui-icon layui-icon-link";

	String CHILDREN_ICON = "layui-icon layui-icon-circle-dot";

	String HREF_TEMPLATE = "/generator?id={}";

	/**
	 * 状态
	 */
	interface Status {
		/**
		 * 冻结
		 */
		Integer FREEZE = 0;
		/**
		 * 正常
		 */
		Integer OK = 1;
	}

}

package com.chao.cloud.generator.domain.dto;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @功能：mysql 返回信息
 * @author： 南帅
 * @version 1.0.0
 */
@Data
public class MysqlTableDTO {

	private String name;
	private String engine;
	private String comment;
	private Date createTime;

	public String getTableName() {
		return this.name;
	}

}

package com.chao.cloud.generator.domain.vo;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 
 * @功能：连接
 * @author： 南帅
 * @version 1.0.0
 */
@Data
public class ConnVO {

	@NotNull
	private Integer id;

	private String tableName;

}

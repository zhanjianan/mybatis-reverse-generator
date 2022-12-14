package com.chao.cloud.generator.domain.dto;

import java.util.List;

import lombok.Data;

/**
 * 
 * @功能：配置详情
 * @author： 南帅
 * @version 1.0.0
 */
@Data
public class MenuDTO {

	private Integer id;
	private String name;
	private List<Config> configs;

	@Data
	public static class Config {
		private Integer id;
		private String title;
	}

}

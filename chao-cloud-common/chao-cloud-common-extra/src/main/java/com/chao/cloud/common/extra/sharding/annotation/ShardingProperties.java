package com.chao.cloud.common.extra.sharding.annotation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.chao.cloud.common.extra.sharding.strategy.DateStrategyEnum;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.Setter;

/**
 * 分库分表配置
 * 
 * @author 薛超
 * @since 2020年12月1日
 * @version 1.0.0
 */
@Data
@ConfigurationProperties(prefix = "chao.cloud.sharding")
public class ShardingProperties {
	/**
	 * 数据源：列集合<br>
	 * ds0: <br>
	 * - A01<br>
	 * - B01<br>
	 * - B09<br>
	 * - B04
	 */
	private Map<String, List<String>> dsColumnMap = new HashMap<>();
	/**
	 * 日期策略：默认12个月
	 */
	private DateStrategyEnum dateStrategy = DateStrategyEnum.MONTH_12;
	/**
	 * 数据源数量：默认1
	 */
	private int dsNum = 1;

	/**
	 * 分库字段-目前只支持一个
	 */
	private String dsShardingColumn = StrUtil.EMPTY;

	/**
	 * 默认数据源name
	 */
	private String defaultDsName;

	/**
	 * 日期分表：table:列名<br>
	 * 无需配置：自动填装
	 */
	@Setter(lombok.AccessLevel.NONE)
	private Map<String, String> dateTableColumnMap = new ConcurrentHashMap<>();

}

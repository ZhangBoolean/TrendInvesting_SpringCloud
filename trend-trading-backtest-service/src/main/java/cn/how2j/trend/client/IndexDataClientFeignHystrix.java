/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.client;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.how2j.trend.pojo.IndexData;
import cn.hutool.core.collection.CollectionUtil;

@Component
public class IndexDataClientFeignHystrix implements IndexDataClient {

	@Override
	public List<IndexData> getIndexData(String code) {
		IndexData indexData = new IndexData();
		indexData.setClosePoint(0);
		indexData.setDate("0000-00-00");
		return CollectionUtil.toList(indexData);
	}

}

/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

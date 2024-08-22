/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.service;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.how2j.trend.pojo.Index;
import cn.hutool.core.collection.CollUtil;

@Service
@CacheConfig(cacheNames="indexes")
public class IndexService {
	private List<Index> indexes;

    @Cacheable(key="'all_codes'")
    public List<Index> get(){
    	Index index = new Index();
    	index.setName("无效指数代码");
    	index.setCode("000000");
    	return CollUtil.toList(index);
    }
}

/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

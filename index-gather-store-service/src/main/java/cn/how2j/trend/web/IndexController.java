/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.how2j.trend.pojo.Index;
import cn.how2j.trend.service.IndexService;

@RestController
public class IndexController {
	@Autowired IndexService indexService;


//	http://127.0.0.1:8001/freshCodes
//	http://127.0.0.1:8001/getCodes
//	http://127.0.0.1:8001/removeCodes

	@GetMapping("/freshCodes")
	public String fresh() throws Exception {
		indexService.fresh();
		return "fresh codes successfully";
	}
	@GetMapping("/getCodes")
	public List<Index> get() throws Exception {
		return indexService.get();
	}
	@GetMapping("/removeCodes")
	public String remove() throws Exception {
		indexService.remove();
		return "remove codes successfully";
	}
}


/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

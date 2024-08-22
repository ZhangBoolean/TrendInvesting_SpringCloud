/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.how2j.trend.pojo.IndexData;
import cn.how2j.trend.service.IndexDataService;
 
@RestController
public class IndexDataController {
	@Autowired IndexDataService indexDataService;
	
	
//	http://127.0.0.1:8001/freshIndexData/000300
//	http://127.0.0.1:8001/getIndexData/000300
//	http://127.0.0.1:8001/removeIndexData/000300
	
	@GetMapping("/freshIndexData/{code}")
	public String fresh(@PathVariable("code") String code) throws Exception {
		indexDataService.fresh(code);
		return "fresh index data successfully";
	}
	@GetMapping("/getIndexData/{code}")
	public List<IndexData> get(@PathVariable("code") String code) throws Exception {
		return indexDataService.get(code);
	}
	@GetMapping("/removeIndexData/{code}")
	public String remove(@PathVariable("code") String code) throws Exception {
		indexDataService.remove(code);
		return "remove index data successfully";
	}
}


/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

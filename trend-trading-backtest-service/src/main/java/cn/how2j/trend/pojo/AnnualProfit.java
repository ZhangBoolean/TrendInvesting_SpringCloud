/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.pojo;

public class AnnualProfit {

	private int year;
	private float indexIncome;
	private float trendIncome;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getIndexIncome() {
		return indexIncome;
	}
	public void setIndexIncome(float indexIncome) {
		this.indexIncome = indexIncome;
	}
	public float getTrendIncome() {
		return trendIncome;
	}
	public void setTrendIncome(float trendIncome) {
		this.trendIncome = trendIncome;
	}
	@Override
	public String toString() {
		return "AnnualProfit [year=" + year + ", indexIncome=" + indexIncome + ", trendIncome=" + trendIncome + "]";
	}
	
	
	
}

/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

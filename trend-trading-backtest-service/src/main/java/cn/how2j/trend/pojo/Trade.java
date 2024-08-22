/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package cn.how2j.trend.pojo;

public class Trade {
	
	private String buyDate;
	private String sellDate;
	private float buyClosePoint;
	private float sellClosePoint;
	private float rate;

	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	public float getBuyClosePoint() {
		return buyClosePoint;
	}
	public void setBuyClosePoint(float buyClosePoint) {
		this.buyClosePoint = buyClosePoint;
	}
	public float getSellClosePoint() {
		return sellClosePoint;
	}
	public void setSellClosePoint(float sellClosePoint) {
		this.sellClosePoint = sellClosePoint;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}

	
	
	
}

/**
* 趋势投资 SpringCloud 教程 为 how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

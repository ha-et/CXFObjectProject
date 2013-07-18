package cn.jbit.ws.entity;

import java.io.Serializable;

/**
 * 产品实体类。
 * @author 北大青鸟
 *
 */
public class Product implements Serializable {
	private static final long serialVersionUID = 4528984960789097986L;
	// 产品编号
	private int id;
	// 产品名称
	private String name;
	// 产品产地
	private String area;
	// 产品价格
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

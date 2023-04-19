package kr.ac.kopo.starcafekiosk.model;

import java.util.ArrayList;

import kr.ac.kopo.starcafekiosk.pager.ProductPager;

public class PagerMap {
	private ArrayList<Product> list;
	private ProductPager pager;
	public ArrayList<Product> getList() {
		return list;
	}
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
	public ProductPager getPager() {
		return pager;
	}
	public void setPager(ProductPager pager) {
		this.pager = pager;
	}
	
	
}

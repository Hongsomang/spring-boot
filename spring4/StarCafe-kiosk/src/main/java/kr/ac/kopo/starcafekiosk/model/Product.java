package kr.ac.kopo.starcafekiosk.model;

public class Product {
	private int id;
	private String name;
	private int price;
	private int category; // 1.�쓬猷�, 2.�뫖�뱶, 3.�긽�뭹, 4.移대뱶
	private int status;  // 0.�뙋留ㅼ쨷吏�, 1.�뙋留ㅼ쨷
	
	public String getCategory_() {
		if(category == 1)
			return "음료";
		else if (category == 2)
			return "푸드";
		else if (category == 3)
			return "상품";
		else if (category == 4)
			return "카드";
		else
			return "알수없음";
	}
	
	public String getStatus_() {
		if(status==0) {
			return"판매중지";
		}
		else if(status==1) {
			return"판매중";
		}
		else{
			return"알수없음";
		}
	}
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}

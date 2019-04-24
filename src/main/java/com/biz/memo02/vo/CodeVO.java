package com.biz.memo02.vo;

public class CodeVO {
	private String label;	
	private String value;
	
	
	
	public CodeVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CodeVO(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}



	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return "CodeVO [label=" + label + ", value=" + value + "]";
	}
	
	
}

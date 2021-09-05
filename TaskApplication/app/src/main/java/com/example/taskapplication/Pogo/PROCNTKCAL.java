package com.example.taskapplication.Pogo;

import com.google.gson.annotations.SerializedName;

public class PROCNTKCAL{

	@SerializedName("unit")
	private String unit;

	@SerializedName("quantity")
	private int quantity;

	@SerializedName("label")
	private String label;

	public String getUnit(){
		return unit;
	}

	public int getQuantity(){
		return quantity;
	}

	public String getLabel(){
		return label;
	}
}
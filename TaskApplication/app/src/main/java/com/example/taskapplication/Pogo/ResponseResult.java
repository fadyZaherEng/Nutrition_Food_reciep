package com.example.taskapplication.Pogo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseResult{

	@SerializedName("dietLabels")
	private List<String> dietLabels;

	@SerializedName("cautions")
	private List<Object> cautions;

	@SerializedName("healthLabels")
	private List<String> healthLabels;

	@SerializedName("totalWeight")
	private double totalWeight;

	@SerializedName("totalDaily")
	private TotalDaily totalDaily;

	@SerializedName("calories")
	private int calories;

	@SerializedName("totalNutrientsKCal")
	private TotalNutrientsKCal totalNutrientsKCal;

	@SerializedName("uri")
	private String uri;

	@SerializedName("totalNutrients")
	private TotalNutrients totalNutrients;

	public List<String> getDietLabels(){
		return dietLabels;
	}

	public List<Object> getCautions(){
		return cautions;
	}

	public List<String> getHealthLabels(){
		return healthLabels;
	}

	public double getTotalWeight(){
		return totalWeight;
	}

	public TotalDaily getTotalDaily(){
		return totalDaily;
	}

	public int getCalories(){
		return calories;
	}

	public TotalNutrientsKCal getTotalNutrientsKCal(){
		return totalNutrientsKCal;
	}

	public String getUri(){
		return uri;
	}

	public TotalNutrients getTotalNutrients(){
		return totalNutrients;
	}
}
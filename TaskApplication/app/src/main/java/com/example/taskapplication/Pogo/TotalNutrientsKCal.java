package com.example.taskapplication.Pogo;

import com.google.gson.annotations.SerializedName;

public class TotalNutrientsKCal{

	@SerializedName("PROCNT_KCAL")
	private PROCNTKCAL pROCNTKCAL;

	@SerializedName("ENERC_KCAL")
	private ENERCKCAL eNERCKCAL;

	@SerializedName("FAT_KCAL")
	private FATKCAL fATKCAL;

	@SerializedName("CHOCDF_KCAL")
	private CHOCDFKCAL cHOCDFKCAL;

	public PROCNTKCAL getPROCNTKCAL(){
		return pROCNTKCAL;
	}

	public ENERCKCAL getENERCKCAL(){
		return eNERCKCAL;
	}

	public FATKCAL getFATKCAL(){
		return fATKCAL;
	}

	public CHOCDFKCAL getCHOCDFKCAL(){
		return cHOCDFKCAL;
	}
}
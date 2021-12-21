package com.xworkz.collection.Perfume.DTO;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class PerfumeDto {

	private String brand;
	private int price;
	private int serialNum;
	private int volt;

	public PerfumeDto(String brand, int price, int serialNum, int volt) {
		System.out.println("Inside perfume DTO");
		this.brand = brand;
		this.price = price;
		this.serialNum = serialNum;
		this.volt = volt;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	@Override
	public int hashCode() {
		return this.serialNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;

		}
		return true;
	}

	public static Iterator iterator() {
		return null;
		// TODO Auto-generated method stub

	}

	public static boolean remove(PerfumeDto dto) {
		return false;
		// TODO Auto-generated method stub

	}

	}


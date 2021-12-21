package com.xworkz.collection.Perfume.Service;

import com.xworkz.collection.Perfume.DTO.PerfumeDto;

public interface PerfumeService {

	public void validateSave(PerfumeDto dto);

	public void display();

	public void remove(PerfumeDto dto);

	public void updatePriceBySerialNumber(int newPrice, int serialNumber);
	
}
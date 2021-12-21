package com.xworkz.collection.Perfume.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.Perfume.DTO.PerfumeDto;

public class PerfumeDaoImpl implements PerfumeDaoInterface {

	public PerfumeDaoImpl() {
		System.out.println("Inside dao impl");
	}

	List perfume = new ArrayList();

	public void savePerfumeDto(PerfumeDto dto) {
		perfume.add(dto);

	}

	public void display() {
		System.out.println("Inside display");
		Iterator iterator = perfume.iterator();
		while (iterator.hasNext()) {
			PerfumeDto p = (PerfumeDto) iterator.next();
			System.out.println(p.getBrand());
			System.out.println(p.getPrice());
			System.out.println(p.getSerialNum());
			System.out.println(p.getVolt());
			System.out.println("----------------------");
		}
	}

	@Override
	public void remove(PerfumeDto dto) {
		boolean remove = perfume.remove(dto);
		if (remove) {
			System.out.println("Removed success");
		}

	}

	public void updatePriceBySerialNumber(int newPrice, int serialNumber) {
		for (Object object : perfume) {
			PerfumeDto p = (PerfumeDto) object;
			if (p.getSerialNum() == serialNumber) {
				p.setPrice(newPrice);
			}
		}
	}
}

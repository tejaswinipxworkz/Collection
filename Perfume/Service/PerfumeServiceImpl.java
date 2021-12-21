package com.xworkz.collection.Perfume.Service;

import java.util.Iterator;

import com.xworkz.collection.Perfume.DAO.PerfumeDaoImpl;
import com.xworkz.collection.Perfume.DTO.PerfumeDto;
import com.xworkz.collection.Perfume.Exception.InvalidBrand;
import com.xworkz.collection.Perfume.Exception.InvalidPrice;
import com.xworkz.collection.Perfume.Exception.InvalidSerialNum;
import com.xworkz.collection.Perfume.Exception.InvalidVolt;

public class PerfumeServiceImpl implements PerfumeService {
	PerfumeDaoImpl perfumedaoimpl = new PerfumeDaoImpl();
	boolean status = true;

	@Override
	public void validateSave(PerfumeDto dto) {
		try {
			if (dto.getBrand().length() < 2 && dto.getBrand() == null) {
				this.status=false;
				throw new InvalidBrand("Invalid brand");
			}
			if(dto.getPrice()==0) {
				this.status=false;
				throw new InvalidPrice("Invalid Price");
			}
			if(dto.getSerialNum()==0) {
				this.status=false;
				throw new InvalidSerialNum("Invalid serial Number");
			}
			if(dto.getVolt()<50) {
				this.status=false;
				throw new InvalidVolt("Invalid volt");	
			}
		} catch (InvalidBrand e) {
			e.printStackTrace();
		} catch (InvalidPrice e) {
			e.printStackTrace();
		} catch (InvalidSerialNum e) {
			e.printStackTrace();
		} catch (InvalidVolt e) {
			e.printStackTrace();
		}
		if(status) {
			perfumedaoimpl.savePerfumeDto(dto);
		}
	}

	@Override
	public void display() {
		perfumedaoimpl.display();
	}

	public void remove(PerfumeDto dto) {
		perfumedaoimpl.remove(dto);
	}

	@Override
	public void updatePriceBySerialNumber(int newPrice, int serialNumber) {
		perfumedaoimpl.updatePriceBySerialNumber(900000, 70);
		
	}


}

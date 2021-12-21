package com.xworkz.collection.Perfume;

import java.util.ArrayList;
import java.util.Collections;

import com.xworkz.collection.Perfume.DTO.PerfumeDto;
import com.xworkz.collection.Perfume.Service.PerfumeServiceImpl;

public class TestPerfume {
public static void main(String[] args) {

PerfumeDto p1 =	new PerfumeDto("op", 9000, 80, 200);
PerfumeDto p2 =	new PerfumeDto("op", 9000, 80, 200);
PerfumeDto p3 =	new PerfumeDto("up", 6000, 70, 150);
PerfumeDto p4 =	new PerfumeDto("kp", 7000, 40, 102);

PerfumeServiceImpl perfumeserviceimpl = new PerfumeServiceImpl();

perfumeserviceimpl.validateSave(p4);
perfumeserviceimpl.validateSave(p3);
perfumeserviceimpl.validateSave(p2);
perfumeserviceimpl.validateSave(p1);

System.out.println("Before removing");
perfumeserviceimpl.display();

perfumeserviceimpl.remove(p4);
System.out.println("After removing p4");
perfumeserviceimpl.display();

perfumeserviceimpl.updatePriceBySerialNumber(90000, 70);
System.out.println("After updating price");
perfumeserviceimpl.display();

System.out.println(p2.hashCode());

System.out.println(p2.equals(p1));
}


}

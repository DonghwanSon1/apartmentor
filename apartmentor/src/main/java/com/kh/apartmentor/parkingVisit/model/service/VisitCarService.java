package com.kh.apartmentor.parkingVisit.model.service;

import java.util.ArrayList;

import com.kh.apartmentor.common.model.vo.PageInfo;
import com.kh.apartmentor.parking.model.vo.Parking;
import com.kh.apartmentor.parkingVisit.model.vo.ParkingVisit;

public interface VisitCarService {
	
	// 방문차량등록(insert)
	int enrollVisitCar(ParkingVisit p);

	int setDayVisitCar();

	int selectVisitCar(ParkingVisit p);

	int updateVisitCar(ParkingVisit p);
	
	ArrayList<Parking> selectVisitCarList(String aptNo);
	
	// ------------관리자 방문차량-------------------
	int adminVisitCarListCount();
	
	ArrayList<Parking> adminVisitCarList(PageInfo pi);
	
	int deleteVisitCar(String carNo);
}

package com.xworkz.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;
@Component
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDAO mobiledao;

	public MobileServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "object is created");
	}

	public boolean validateMobileDetails(MobileDTO mobileDTO) {
		MobileEntity mobileEntity = new MobileEntity();
		mobileEntity.setName(mobileDTO.getName());
		mobileEntity.setBrand(mobileDTO.getBrand());
		mobileEntity.setRam(mobileDTO.getRam());
		mobileEntity.setPrice(mobileDTO.getPrice());

		boolean mobileDetails = mobiledao.saveMobileDetails(mobileEntity);
		if (mobileDetails) {
			System.out.println("data saved successfully");
			return true;
		} else {
			System.out.println("data not saved");
			return false;
		}

	}

}

package com.xworkz.mobile.service;

import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

public interface MobileService {
	public boolean validateMobileDetails(MobileDTO mobileDTO);
	public MobileDTO getMobileInfo(String name);
	public List<MobileEntity> validateAllMobileDetails();

}

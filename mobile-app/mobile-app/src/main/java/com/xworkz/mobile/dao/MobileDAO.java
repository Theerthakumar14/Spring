package com.xworkz.mobile.dao;

import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

public interface MobileDAO {
	

	public boolean saveMobileDetails(MobileEntity mobileEntity);
	public MobileEntity getMobileEntityByName(String name);
	public List<MobileEntity> getMobileDetails();

}

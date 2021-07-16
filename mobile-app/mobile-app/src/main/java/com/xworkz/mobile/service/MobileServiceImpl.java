package com.xworkz.mobile.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDAO mobiledao;

	public static Map<String, String> map = new HashMap<String, String>();

	public MobileServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "object is created");
	}

	public boolean validateMobileDetails(MobileDTO mobileDTO) {
		boolean flag = false;
		if (mobileDTO.getName() != null && !mobileDTO.getName().isEmpty() && mobileDTO.getName().length() >= 6) {
			System.out.println("Entered mobile name is valid");
			flag = true;
		} else {
			map.put("MobileName", "Entered mobile name is invalid atleast consists of 6 characters");
			flag = false;
		}
		if (mobileDTO.getBrand() != null && !mobileDTO.getBrand().isEmpty() && mobileDTO.getBrand().length() >= 6) {
			System.out.println("Mobile brand is valid");
			flag = true;
		} else {
			map.put("MobileBrand", "Entered mobile brand is invalid atleast consists of 6 characters");
			flag = false;
		}
		if (mobileDTO.getRam() != 0 && mobileDTO.getRam() > 0) {
			System.out.println("Entered mobile ram is valid");
			flag = true;
		} else {
			map.put("MobileRam", "The ram details should be greater than 0");
			flag = false;
		}
		if (mobileDTO.getPrice() != 0 && mobileDTO.getPrice() >= 500) {
			System.out.println("Mobile price is valid");
			flag = true;
		} else {
			map.put("MobilePrice", "Mobile price should be grater than 500");
			flag = false;
		}

		if (flag == true) {
			MobileEntity mobileEntity = new MobileEntity();
			BeanUtils.copyProperties(mobileDTO, mobileEntity);
			boolean mobileDetails = mobiledao.saveMobileDetails(mobileEntity);
			return mobileDetails;
		} else {
			return false;
		}
	}

	public MobileDTO getMobileInfo(String name) {
		System.out.println("invoked getMobileInfo");
		MobileEntity mobileEntity = this.mobiledao.getMobileEntityByName(name);
		if (mobileEntity != null) {
			MobileDTO mobileDTO = new MobileDTO();
			BeanUtils.copyProperties(mobileEntity, mobileDTO);
			return mobileDTO;
		} else {
			return null;
		}
	}

	public List<MobileEntity> validateAllMobileDetails() {
		System.out.println("invoked allMobileDetails");
		List<MobileEntity> mobileDetails = this.mobiledao.getMobileDetails();
		if (!mobileDetails.isEmpty()) {
			return mobileDetails;
		} else {
			return null;
		}
	}

}

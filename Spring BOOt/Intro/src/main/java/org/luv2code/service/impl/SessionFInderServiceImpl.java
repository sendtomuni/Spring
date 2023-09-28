package org.luv2code.service.impl;

import java.time.LocalDate;

import org.luv2code.service.SessionFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionFInderServiceImpl implements SessionFinderService {

	@Autowired
	private LocalDate currentDate;
	
	@Override
	public String findSeason() {
		int month = currentDate.getMonthValue();
		switch (month) {
		case 1:
		case 2:
		case 3:
			return "Winter";
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			return "Summer";
		case 10:
		case 11:
		case 12:
			return "Rainy";
		default:
			break;
		}
		return null;
	}
	
	@Autowired
	public SessionFInderServiceImpl() {
		System.out.println("SessionFInderServiceImpl.SessionFInderServiceImpl()");
		System.out.println(this.currentDate);
	}

}

package com.lmg.spirng.hibernate.service;

import java.util.List;

public interface CashierService {
	
	public void checkout(String username, List<String> isbns);
}

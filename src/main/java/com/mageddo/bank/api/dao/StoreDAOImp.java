package com.mageddo.bank.api.dao;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

public class StoreDAOImp implements StoreDAO {

	@Autowired
	private DSLContext dsl;

}

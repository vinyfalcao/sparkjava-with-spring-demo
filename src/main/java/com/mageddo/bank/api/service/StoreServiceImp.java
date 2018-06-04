package com.mageddo.bank.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mageddo.bank.api.dao.StoreDAO;

/**
 * 
 * @author Vinicius Falcão
 *
 */
@Service
public class StoreServiceImp implements StoreService {

	@Autowired
	private StoreDAO storeDAO;

}

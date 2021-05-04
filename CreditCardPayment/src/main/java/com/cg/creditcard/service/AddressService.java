package com.cg.creditcard.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.dao.AddressRepository;
import com.cg.creditcard.entity.Address;
@Service
public class AddressService implements IAddressService {
	@Autowired
	AddressRepository dao;
	List<Address>AddressList=new ArrayList<>();
	@Override
	public void addAddress(Address address) {
		dao.save(address);
		
	}
	@Override
	public String removeAddress(int addressid) {
		if(dao.existsById(addressid)) {
			dao.deleteById(addressid);
			return "address deleted";
		}
		return "no address with this id found";
	}
	@Override
	public String updateAddress(int addressid, Address address) {
		if(dao.existsById(addressid)) {
			Address addressupdate=dao.findById(addressid).get();
			addressupdate.setHouse_no(address.getHouse_no());
			addressupdate.setStreet(address.getStreet());
			addressupdate.setArea(address.getArea());
			addressupdate.setCity(address.getCity());
			addressupdate.setState_name(address.getState_name());
			addressupdate.setPincode(address.getPincode());
			dao.save(addressupdate);
			return " address updated";
		}
		return "no address with id found";
		
	}
	@Override
	public List<Address> getAllAddress() {
		List<Address>addlist=dao.findAll();
		return addlist;
	}

}

package com.cg.creditcard.service;
import java.util.List;
import com.cg.creditcard.entity.Address;
public interface IAddressService {
	public  void addAddress(Address address);
	public String removeAddress(int addressid);
	public String updateAddress(int addressid,Address address);
	public List<Address> getAllAddress();

}

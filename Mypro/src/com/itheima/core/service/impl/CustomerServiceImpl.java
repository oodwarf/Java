package com.itheima.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.itheima.common.utils.Page;
import com.itheima.core.dao.CustomerDao;
import com.itheima.core.po.Customer;
import com.itheima.core.service.CustomerService;


@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public Page<Customer> findCustomerList(Integer page, Integer rows,
			String custName, String custSource, String custIndustry,
			String custLevel) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		if (StringUtils.isNotBlank(custName)) {
			customer.setCust_name(custName);
		}
		
		if (StringUtils.isNotBlank(custSource)) {
			customer.setCust_source(custSource);
		}
		
		if (StringUtils.isNotBlank(custIndustry)) {
			customer.setCust_industry(custIndustry);
		}
		if (StringUtils.isNotBlank(custLevel)){
			customer.setCust_level(custLevel);
		}
		customer.setStart((page-1)*rows);
		customer.setRows(rows);
		List<Customer> customers=customerDao.selectCustomerList(customer);
		Integer count=customerDao.selectCustomerListCount(customer);
		Page<Customer> result=new Page<Customer>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

	//É¾³ý
	public int deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(id);
	}

	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		Customer customer=customerDao.getCustomerById(id);
		return customer;
	}

	//ÐÞ¸Ä
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	//´´½¨
	public int createCustomer(Customer customer){
		// TODO Auto-generated method stub
		return customerDao.createCustomer(customer);
	}

}

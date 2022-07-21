package org.banking.mybankingapplication.service;


import lombok.RequiredArgsConstructor;
import org.banking.mybankingapplication.model.dto.CustomerDTO;
import org.banking.mybankingapplication.model.entity.Customer;
import org.banking.mybankingapplication.model.mapper.CustomerMapper;
import org.banking.mybankingapplication.model.mapper.ICustomerMapper;
import org.banking.mybankingapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    //private ICustomerMapper iCustomerMapper;
    private CustomerMapper customerMapper;

    public List<CustomerDTO> getAllCustomers(){

        var customers = customerRepository.findAll();
        List<CustomerDTO> customerDTOs = customerMapper.toDTO(customers);


        //Send custom response ??
        if(customerDTOs.isEmpty()){
            //throw new RuntimeException("");
        }
        return customerDTOs;
    }
/*
    public CustomerDTO getCustomerById(Long id){

        var customers = customerRepository.getAll();

        return customerMapper.toDTO(customer);
    }

 */

}
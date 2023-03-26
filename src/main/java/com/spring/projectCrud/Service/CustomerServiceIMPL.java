package com.spring.projectCrud.Service;


import com.spring.projectCrud.CustomerDTO.CustomerDTO;
import com.spring.projectCrud.CustomerRepo.CustomerRepo;
import com.spring.projectCrud.CustomerDTO.CustomerSaveDTO;
import com.spring.projectCrud.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomerName();

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for(Customer a:getCustomers){
            CustomerDTO customerDTO = new CustomerDTO(
                    a.getCustomerid(),
                    a.getCustomerName(),
                    a.getCustomerAddress(),
                    a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }
}

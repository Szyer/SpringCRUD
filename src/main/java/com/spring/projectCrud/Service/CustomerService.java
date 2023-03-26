package com.spring.projectCrud.Service;


import com.spring.projectCrud.CustomerDTO.CustomerDTO;
import com.spring.projectCrud.CustomerDTO.CustomerSaveDTO;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomers();
}

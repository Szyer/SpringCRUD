package com.spring.projectCrud.CustomerController;

import com.spring.projectCrud.CustomerDTO.CustomerDTO;
import com.spring.projectCrud.CustomerDTO.CustomerSaveDTO;
import com.spring.projectCrud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(path="/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }

    @GetMapping(path="/getAllCustomers")
    public List<CustomerDTO> getAllCustomers(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }
}

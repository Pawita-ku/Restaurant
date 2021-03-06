package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.restaurant.model.Customer;
import th.ac.ku.restaurant.service.CustomerService;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController( CustomerService customerService) {
        this.customerService = customerService;
    }
    //ArrayList<Customer> customers=new ArrayList<>();
    //@GetMapping("/customer")
    @GetMapping
    public String getCustomerPage(Model model){
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "customer";
    }

    //@PostMapping("/customer")
    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model model){
        customerService.createCustomer(customer);
        model.addAttribute("allCustomers",customerService.getCustomers());
        return "redirect:customer";
    }
}


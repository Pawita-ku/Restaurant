package th.ac.ku.restaurant.service;

import org.springframework.stereotype.Service;
import th.ac.ku.restaurant.data.CustomerRepository;
import th.ac.ku.restaurant.model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {
    private CustomerRepository repository;
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }
    /*
    private List<Customer> customerList;
    @PostConstruct
    public void postConstruct( ) {
        this.customerList = new ArrayList<>();
    }
     */

    public void createCustomer(Customer customer) {
        repository.save(customer);
        //customerList.add(customer);
    }
    public List<Customer> getCustomers( ) {
        return repository.findAll();
        //return new ArrayList<>(this.customerList) ;
    }
    public Customer findCustomer (int id){
        try {
            return repository.findById(id).get();
        } catch (NoSuchElementException e){
            return null;
        }
        /*
        for (Customer customer:customerList){
            if (customer.getId()==id)
                return customer;    }
        return null;
         */
    }
}

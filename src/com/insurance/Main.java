package com.insurance;

import com.insurance.main.CustomerManagementModule;
import com.insurance.model.Address;
import com.insurance.model.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerManagementModule.createCustomer();
        CustomerManagementModule.printAllCustomers();
    }
}
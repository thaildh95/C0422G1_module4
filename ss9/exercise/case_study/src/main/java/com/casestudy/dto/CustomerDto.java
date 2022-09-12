package com.casestudy.dto;

import com.casestudy.model.person.customer.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class CustomerDto implements Validator {
    private Integer id;

    private CustomerType customerType;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$", message = "Enter the wrong format .Please enter!!")
    private String name;

    @NotBlank
    private String dayOfBirth;


    private Integer gender;


    @NotBlank
    @Pattern(regexp = "^([0-9]{9})|([0-9]{12})$", message = "Enter the wrong format .Please enter!!")
    private String idCard;

    @NotBlank
    @Pattern(regexp = "^(090|091|(84+)90|(84+)91)[0-9]{6}$", message = "Enter the wrong format .Please enter!!")
    private String phoneNumber;


    @Email(message = "Please enter email !!")
    private String email;

    @NotBlank
    private String address;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, CustomerType customerType, String name, String dayOfBirth,
                       Integer gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
        if (!(customerDto.dayOfBirth == null || customerDto.dayOfBirth.equals(""))) {
            try {
                LocalDate.parse(customerDto.dayOfBirth);
            } catch (Exception e) {
                errors.rejectValue("dayOfBirth", "day.err", "please input right format");
            }
        }
    }
}

package com.form.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;

public class FormDto implements Validator {
    private Integer id;
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank(message = "please enter !")
    @Pattern(regexp = "(01|02|03|04|05|06|07|08|09)[1-9]{8}", message = "Wrong format please enter again")
    private String phone;

    @NotBlank
    private String age;

    @Email
    private String email;

    public FormDto() {
    }

    public FormDto(Integer id, String firstName, String lastName, String phone, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        FormDto formDto = (FormDto) target;
        LocalDate localDate = null;
        LocalDate now = LocalDate.now();
        try {
            localDate = LocalDate.parse(formDto.getAge());
            if (Period.between(localDate, now).getYears() < 18) {
                errors.rejectValue("age", "age.create", "Age must bigger than 18");
            }
        } catch (Exception e) {
            errors.rejectValue("age", "create.name", "please enter here");
        }
    }
}



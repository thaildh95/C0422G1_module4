package com.health.repository;

import com.health.model.HealthDeclare;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Repository
public class HealthRepository implements IHealthRepository{
    private static List<HealthDeclare> healthDeclares = new ArrayList<>();
    private static List<String> dayList = new ArrayList<>();
    private static List<String> monthList = new ArrayList<>();
    private static List<String> yearList = new ArrayList<>();
    private static List<String> genderList = new ArrayList<>();
    private static List<String> nationList = new ArrayList<>();
    private static List<String> vehicleList = new ArrayList<>();

    static  {
        for (int i = 1; i <= 31 ; i++) {
            dayList.add(String.valueOf(i));
        }

    }
    static {
        for (int i = 1; i <=12 ; i++) {
            monthList.add(String.valueOf(i));
        }
    }
    static {
        for (int i = 1900; i <=2022 ; i++) {
            yearList.add(String.valueOf(i));
        }

    }
    static {
        genderList.add("male");
        genderList.add("female");
        genderList.add("bisexual");
        genderList.add("lesbian");
        genderList.add("gay");
        genderList.add("homo");

    }
    static{
        nationList.add("Viet Nam");
        nationList.add("Thai Lan");
        nationList.add("Laos");
        nationList.add("Singapore");
        nationList.add("America");
        nationList.add("China");
        nationList.add("Russia");
        nationList.add("Malaysia");
    }
    static {
        vehicleList.add("Xe đạp");
        vehicleList.add("Xe máy");
        vehicleList.add("Ô tô");
        vehicleList.add("Máy bay");
        vehicleList.add("Tàu hỏa");
    }

    @Override
    public List<String> listDay() {
        return dayList;
    }

    @Override
    public List<String> listMonth() {
        return monthList;
    }

    @Override
    public List<String> vehicle() {
        return vehicleList;
    }

    @Override
    public List<String> listYear() {
        return yearList;
    }

    @Override
    public List<HealthDeclare> listDeclare(HealthDeclare healthDeclare) {
       healthDeclares.add(healthDeclare);
       return healthDeclares;
    }

    @Override
    public List<String> genderList() {
        return genderList;
    }

    @Override
    public List<String> nationList() {
        return nationList;
    }

    @Override
    public HealthDeclare searchById(String id) {

        for (HealthDeclare h: healthDeclares) {
            if (h.getId().equals(id)){
                return h;
            }
        }return null;
    }

    @Override
    public void update(String id, HealthDeclare healthDeclare) {

        for (HealthDeclare h : healthDeclares){
            if (h.getId().equals(id)){
                BeanUtils.copyProperties(h,healthDeclare);
            }
        }

    }

    @Override
    public List<HealthDeclare> showList() {
        return healthDeclares;
    }
}

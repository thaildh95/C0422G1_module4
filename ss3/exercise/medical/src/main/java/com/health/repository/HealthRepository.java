package com.health.repository;

import com.health.model.HealthDeclare;
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
        dayList.add("1");
        dayList.add("2");
        dayList.add("3");
        dayList.add("4");
        dayList.add("5");
        dayList.add("6");
        dayList.add("7");
        dayList.add("8");
        dayList.add("9");
        dayList.add("10");
        dayList.add("11");
        dayList.add("12");
        dayList.add("13");
        dayList.add("14");
        dayList.add("15");
        dayList.add("16");
        dayList.add("17");
        dayList.add("18");
        dayList.add("19");
        dayList.add("20");
        dayList.add("21");
        dayList.add("22");
        dayList.add("23");
        dayList.add("24");
        dayList.add("25");
        dayList.add("26");
        dayList.add("27");
        dayList.add("28");
        dayList.add("29");
        dayList.add("30");
        dayList.add("31");
    }
    static {
        monthList.add("1");
        monthList.add("2");
        monthList.add("3");
        monthList.add("4");
        monthList.add("5");
        monthList.add("6");
        monthList.add("7");
        monthList.add("8");
        monthList.add("9");
        monthList.add("10");
        monthList.add("11");
        monthList.add("12");
    }
    static {
        yearList.add("1990");
        yearList.add("1991");
        yearList.add("1992");
        yearList.add("1993");
        yearList.add("1994");
        yearList.add("1995");
        yearList.add("1996");
        yearList.add("1997");
        yearList.add("1998");
        yearList.add("1999");
        yearList.add("2000");
        yearList.add("2001");
        yearList.add("2002");
        yearList.add("2003");
        yearList.add("2004");
        yearList.add("2005");
        yearList.add("2006");
        yearList.add("2007");
        yearList.add("2008");
        yearList.add("2009");
        yearList.add("2010");
        yearList.add("2011");
        yearList.add("2012");
        yearList.add("2013");
        yearList.add("2014");
        yearList.add("2015");
        yearList.add("2016");
        yearList.add("2017");
        yearList.add("2018");
        yearList.add("2019");
        yearList.add("2020");
        yearList.add("2021");
        yearList.add("2022");
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
        return null;
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
}

package com.breidgelabs.employeewage;

public class EmployeeWageComputation {
    public static void main(String args[]) {
            System.out.println("Employee Wage Calculation");
            int isPresent = (int)(Math.random() * 10)%2;
            if(isPresent == 1){
                System.out.println("Employee is Present");
            }else{
                System.out.println("Employee is Absent");
            }
        }
    }
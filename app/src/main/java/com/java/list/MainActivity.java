package com.java.list;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
        extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        performListUtilsOperation();
    }

    private void performListUtilsOperation()
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Usman", 25, "Lahore pakistan"));
        employeeList.add(new Employee(2, "Rehman", 17, "Okara pakistan"));
        employeeList.add(new Employee(3, "Hassan", 15, "Karachi pakistan"));
        employeeList.add(new Employee(4, "Mubasshar", 19, "England"));
        employeeList.add(new Employee(5, "Nouman naseer", 33, "America"));
        employeeList.add(new Employee(6, "Naeem", 50, "Canada"));
        employeeList.add(new Employee(7, "Ali", 10, "Australlia"));

        List<Employee> employeesListWithAgeLessThan26 = ListUtils.findWhere(employeeList,
                                                                            employee -> employee.age <= 26);

        Employee singleEmployeeHavingManInNameTop = ListUtils.firstWhere(employeeList,
                                                                         employee -> employee.name.toLowerCase()
                                                                                                  .contains(
                                                                                                          "man"));
        Employee singleEmployeeHavingManInNameBottom = ListUtils.lastWhere(employeeList,
                                                                           employee -> employee.name.toLowerCase()
                                                                                                    .contains(
                                                                                                            "man"));
        double averageAge = ListUtils.sum(employeeList,
                                          employee -> employee.age) / employeeList.size();

        int peopleHavingIdGeaterThan6 = ListUtils.findWhere(employeeList,
                                                            employee -> employee.id > 6)
                                                 .size();
        double averageAgeOfPeopleHavingIdGreaterThan6 = ListUtils.sumWhere(employeeList,
                                                                           employee -> employee.id > 6,
                                                                           employee -> employee.age) / peopleHavingIdGeaterThan6;

        int indexOfItemHavingAge33 = ListUtils.indexWhere(employeeList,
                                                          employee -> employee.age == 33);


        List<Object> addressListObject = ListUtils.mapToObject(employeeList,
                                                               employee -> employee.address);

        List<String> ageListString = ListUtils.mapToType(employeeList,
                                                             employee -> employee.age + " years old");


        List<Employee> newEmployeeListWithItemRemoved = ListUtils.removeWhere(employeeList,
                                                                              employee -> employee.age > 30);

    }

}
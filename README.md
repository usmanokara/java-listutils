# java-listutils
List <> in different langaugea are evolving.New langauges are prviding more powerfull feratures to filter date from the list.
e.g findformlist, delete from list, etc. Java provide list functionality in the form of Streams but that required minimum API level <b>24</b> https://developer.android.com/reference/java/util/stream/Stream. so I decided to create list utils that can make your code clean and understandable. This will supprt api level <b>21</b> and <b>ownward</b> The whole idea is inspired from <b>Flutter</b>
</br>

## Let start with some code

## So this Employee list we will aply different list function to filter data

```
        List<Employee> employeeList = new ArrayList<>();</br>
        employeeList.add(new Employee(1, "Usman", 25, "Lahore pakistan"));</br>
        employeeList.add(new Employee(2, "Rehman", 17, "Okara pakistan"));</br>
        employeeList.add(new Employee(3, "Hassan", 15, "Karachi pakistan"));</br>
        employeeList.add(new Employee(4, "Mubasshar", 19, "England"));</br>
        employeeList.add(new Employee(5, "Nouman naseer", 33, "America"));</br>
        employeeList.add(new Employee(6, "Naeem", 50, "Canada"));</br>
        employeeList.add(new Employee(7, "Ali", 10, "Australlia"));</br>
  ```
  
  ## 1) findWhere()
  ```
  List<Employee> employeesListWithAgeLessThan26 = ListUtils.findWhere(employeeList,
                                                                            employee -> employee.age <= 26);
  ```
</br>


## 2) firstWhere()
  ```
  Employee singleEmployeeHavingManInNameTop = ListUtils.firstWhere(employeeList,
                                                                         employee -> employee.name.toLowerCase()
                                                                                                  .contains(
                                                                                                          "man"));
  ```
</br>


## 3) lastWhere()
  ```
 Employee singleEmployeeHavingManInNameBottom = ListUtils.lastWhere(employeeList,
                                                                           employee -> employee.name.toLowerCase()
                                                                                                    .contains(
                                                                                                            "man"));
  ```
</br>


## 4) sum()
  ```
  double averageAge = ListUtils.sum(employeeList,
                                          employee -> employee.age) / employeeList.size();
  ```
</br>


## 5) sumWhere()
  ```
  int peopleHavingIdGreaterThan6 = ListUtils.findWhere(employeeList,
                                                             employee -> employee.id > 6)
                                                  .size();
        double averageAgeOfPeopleHavingIdGreaterThan6 = ListUtils.sumWhere(employeeList,
                                                                           employee -> employee.id > 6,
                                                                           employee -> employee.age) / peopleHavingIdGreaterThan6
  ```
</br>




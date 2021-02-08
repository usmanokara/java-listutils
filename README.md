
# Java-ListUtils
List <> in different languages are evolving. New languages are providing more powerful features to filter data from the list. e.g find for the list, delete from the list, etc. Java provides list functionality in the form of Streams but that required minimum API level 24 https://developer.android.com/reference/java/util/stream/Stream. so I decided to create a list of utils that can make your code clean and understandable. This will support API level 21 and onward



The whole idea is inspired by <br>Flutter</b>
</br>
1. Gradle dependency:

	```groovy
	allprojects {
	   repositories {
	      	jcenter()
           	maven { url "https://jitpack.io" }  //Make sure to add this in your project for uCrop
	   }
	}
	```

    ```groovy
  	        implementation 'com.github.usmanokara:java-listutils:1.1'

    ```
    
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
  
 ## 1) forEach()
  ```
 ListUtils.forEach(employeeList, (employee, index) -> {
            Log.d("employee", employee.toString() + " at " + index);
        });
  ```
</br>

  
  ## 2) findWhere()
  ```
  List<Employee> employeesListWithAgeLessThan26 = ListUtils.findWhere(employeeList,
                                                                            employee -> employee.age <= 26);
  ```
</br>


## 3) firstWhere()
  ```
  Employee singleEmployeeHavingManInNameTop = ListUtils.firstWhere(employeeList,
                                                                         employee -> employee.name.toLowerCase()
                                                                                                  .contains(
                                                                                                          "man"));
  ```
</br>


## 4) lastWhere()
  ```
 Employee singleEmployeeHavingManInNameBottom = ListUtils.lastWhere(employeeList,
                                                                           employee -> employee.name.toLowerCase()
                                                                                                    .contains(
                                                                                                            "man"));
  ```
</br>


## 5) sum()
  ```
  double averageAge = ListUtils.sum(employeeList,
                                          employee -> employee.age) / employeeList.size();
  ```
</br>


## 6) sumWhere()
  ```
  int peopleHavingIdGreaterThan6 = ListUtils.findWhere(employeeList,
                                                             employee -> employee.id > 6)
                                                  .size();
 double averageAgeOfPeopleHavingIdGreaterThan6 = ListUtils.sumWhere(employeeList,
                                                                           employee -> employee.id > 6,
                                                                           employee -> employee.age) / peopleHavingIdGreaterThan6
  ```
</br>



## 7) indexWhere()
  ```
  int indexOfItemHavingAge33 = ListUtils.indexWhere(employeeList,
                                                          employee -> employee.age == 33);
  ```
</br>

## 8) mapToObject()
  ```
   List<Object> addressListObject = ListUtils.mapToObject(employeeList,
                                                               employee -> employee.address);
  ```
</br>


## 9) mapToType()
  ```
  List<String> ageListString = ListUtils.mapToType(employeeList,
                                                         employee -> employee.age + " years old");
  ```
</br>

## 10) removeWhere()
  ```
   List<Employee> newEmployeeListWithItemRemoved = ListUtils.removeWhere(employeeList,
                                                                              employee -> employee.age > 30);
  ```
</br>

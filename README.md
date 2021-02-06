# java-listutils
List <> in different langaugea are evolving.New langauges are prviding more powerfull feratures to filter date from the list.
e.g findformlist, delete from list, etc. Java provide list functionality in the form of Streams but that required minimum API level <b>24</b> https://developer.android.com/reference/java/util/stream/Stream. so I decided to create list utils that can make your code clean and understandable.  
</br>
### inSpired from Flutter
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
  
  ## 1) Find
<img src="s1.png">

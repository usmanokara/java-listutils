package com.java.list;

public class Employee
{
    public int id;
    public String name;
    public int age;
    public String address;

    public Employee(int id, String name, int age, String address)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

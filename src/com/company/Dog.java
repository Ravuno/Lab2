package com.company;

import java.security.spec.NamedParameterSpec;

public class Dog {
    int age;
    String name;

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return (this.age);
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return (this.name);
    }
    public int to_human()
    {
        return (age * 7);
    }

    @Override
    public String toString() {
        return ("Возраст - \" + age + \" Кличка - \" + name");
    }

    public Dog() {
        age = 0;
        name = "";
    }

}

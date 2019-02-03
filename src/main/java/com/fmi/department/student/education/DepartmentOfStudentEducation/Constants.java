package com.fmi.department.student.education.DepartmentOfStudentEducation;

public class Constants {

    private Constants() {}

    public  static final String  email_regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

    public static final String phone_regex = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";

    public static final String year_regex = "^\\d{4}$";

}

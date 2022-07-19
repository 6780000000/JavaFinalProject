package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //TODO implement

        System.out.println("Show student Summary");
        System.out.println("--------------------------------------------------");
        System.out.println( "Available students:" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student );
            System.out.println("Courses enrolled in :");
        }

        // Print the Courses for each student here



        System.out.println("--------------------------------------------------");

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}

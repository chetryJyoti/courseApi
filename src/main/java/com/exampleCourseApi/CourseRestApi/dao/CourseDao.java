package com.exampleCourseApi.CourseRestApi.dao;

import com.exampleCourseApi.CourseRestApi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao  extends JpaRepository<Course,Long> {

}

package com.exampleCourseApi.CourseRestApi.services;

import com.exampleCourseApi.CourseRestApi.dao.CourseDao;
import com.exampleCourseApi.CourseRestApi.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;


//    List<Course> list;
//    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(1,"java course","basics of java"));
//        list.add(new Course(2,"python courses for beginners","beginner friendly python basic course"));
//    }

//    getting list of Courses
    @Override
    public List<Course> getCourses() {
//       return list;
        return courseDao.findAll();
    }


//    filtering course by id
    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for (Course course:list){
//            if(course.getId()==courseId){
//                c = course;
//                break;
//            }
//        }
//        return c;
        return courseDao.getReferenceById(courseId);
    }

//   adding a new course
    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

 //  updating course
    @Override
    public Course updateCourse(Course course) {
//        for (Course e : list) {
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        };
        courseDao.save(course);
        return course;
    }

    // deleting course by id
    @Override
    public void  deleteCourse(long courseId) {
//        Course c = null;
//        for(Course course:list){
//            if(course.getId() == courseId){
//                c = course;
//                break;
//            }
//        }
//        list.remove(c);
//        return c;
        Course entity = courseDao.getReferenceById(courseId);
        courseDao.delete(entity);
    }
}

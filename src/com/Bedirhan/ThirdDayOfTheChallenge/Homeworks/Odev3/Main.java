package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business.CategoryManager;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business.CourseManager;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business.TutorManager;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.DatabaseLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.FileLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.ILogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.MailLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.category.HibernateCategoryDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.course.HibernateCourseDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.tutor.JdbcTutorDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Category;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Course;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Tutor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        ILogger[] loggers ={
                new DatabaseLogger(),new FileLogger(),new MailLogger()
        };
        Category programming =  new Category("Programming",1);

        ArrayList<Category> categories =  new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers,categories);
        categoryManager.add(programming);
        System.out.println("\n--------------------\n");
        ILogger[] loggers2 ={
                new DatabaseLogger(),new FileLogger(),new MailLogger()
        };
        Tutor enginHocam =  new Tutor("Engin Demirog",1,30,100);
        ArrayList<Tutor> tutors =  new ArrayList<>();
        TutorManager tutorManager =  new TutorManager(new JdbcTutorDao(), loggers2,tutors);
        tutorManager.add(enginHocam);

        System.out.println("\n--------------------\n");
        ILogger[] loggers3 ={
                new DatabaseLogger(),new FileLogger(),new MailLogger()
        };
        Course course1 =  new Course("Java Spring Bootcamp",1,enginHocam,programming,100);
        ArrayList<Course> courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers3,courses);
        courseManager.add(course1);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);


    }
}

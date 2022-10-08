package kodlamaioHomepage;

import kodlamaioHomepage.business.CategoryManager;
import kodlamaioHomepage.business.CourseManager;
import kodlamaioHomepage.business.InstructorManager;
import kodlamaioHomepage.core.logging.DatabaseLogger;
import kodlamaioHomepage.core.logging.FileLogger;
import kodlamaioHomepage.core.logging.ILogger;
import kodlamaioHomepage.core.logging.MailLogger;
import kodlamaioHomepage.dataAccess.HibernateDao;
import kodlamaioHomepage.dataAccess.IBaseDao;
import kodlamaioHomepage.dataAccess.JdbcDao;
import kodlamaioHomepage.entities.Category;
import kodlamaioHomepage.entities.Course;
import kodlamaioHomepage.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
        IBaseDao[] databaseAccessObjects = {new HibernateDao(), new JdbcDao()};

        CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), loggers);

        // For Course 1
        Instructor instructor1 = new Instructor(1,"Engin", "DEMİROĞ");
        Category category1 = new Category(1, "Java");
        Course course1 = new Course(1,"Software Developer Training Camp - (JAVA).", 2200.0, instructor1, category1 );

        // For Course 2
        Instructor instructor2 = new Instructor(2,"Raif", "ÇINAR");
        Category category2 = new Category(2, "C#");
        Course course2 = new Course(2,"Software Developer Training Camp - (C# + ANGULAR)).", 1100, instructor2, category2 );

        courseManager.addNewCourse(course1);
        courseManager.addNewCourse(course2);
        System.out.println("---------------\n");

        categoryManager.addNewCategory(category1);
        categoryManager.addNewCategory(category2);
        System.out.println("---------------\n");

        instructorManager.addNewInstructor(instructor1);
        instructorManager.addNewInstructor(instructor2);
        System.out.println("---------------\n");

        System.out.println("***** Courses From Database Simulation *****");
        for (Course course : databaseAccessObjects[0].getCourseListFromDatabase())
        {
            System.out.println("id: " + course.getCourseId() +
                    ", Name: " + course.getCourseName() +
                    ", Price: " + course.getCoursePrice() +
                    ", Category: " + course.getCourseCategory().getCategoryName() +
                    ", Instructor: " + course.getCourseInstructor().getInstructorFullName());
        }

        // For Exception,
        System.out.println("""

                NOTES: Situations that will throw an exception;
                1- Categories cannot have the same id or name.
                2- Courses cannot have the same id or name.
                3- Instructors cannot have the same id.
                4- The course fee cannot be less than 0.
                
                Exception Throwing Example:""");
        categoryManager.addNewCategory(new Category(1, "Java")); // EXCEPTION...
    }
}

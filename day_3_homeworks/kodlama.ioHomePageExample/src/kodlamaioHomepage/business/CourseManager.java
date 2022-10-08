package kodlamaioHomepage.business;

import kodlamaioHomepage.core.logging.ILogger;
import kodlamaioHomepage.dataAccess.IBaseDao;
import kodlamaioHomepage.entities.Course;

public class CourseManager {

    private IBaseDao courseDao;
    private ILogger[] courseLoggers;

    public CourseManager(IBaseDao courseDao, ILogger[] courseLogger) {
        this.courseDao = courseDao;
        this.courseLoggers = courseLogger;
    }

    public void addNewCourse(Course course) throws Exception {
        // business rules...
        checkCourseRules(course);

        courseDao.addCourseToDatabase(course);

        for(ILogger logger : courseLoggers) {
            logger.log("Course Name: " + course.getCourseName() + " is logged.");
        }
    }

    private void checkCourseRules(Course course) throws Exception {
        if(course.getCoursePrice() < 0)
            throw new Exception("Course Price do not less than 0.");

        if(!isTheCourseNameUnique(course.getCourseName()))
            throw new Exception("There cannot be more than one course with the same name.");

        if(!isTheCourseCategoryUnique(course.getCourseCategory().getCategoryName()))
            throw new Exception("There cannot be more than one category with the same name.");

        if(!isTheCourseIdUnique(course.getCourseId()))
            throw new Exception("There cannot be more than one course id with the same value.");
    }

    private boolean isTheCourseNameUnique(String courseName){

        for(Course course : courseDao.getCourseListFromDatabase())
        {
            if (courseName.equalsIgnoreCase(course.getCourseName())) return false;
        }
        return true;
    }

    private boolean isTheCourseCategoryUnique(String categoryName){

        for(Course course : courseDao.getCourseListFromDatabase())
        {
            if (categoryName.equalsIgnoreCase(course.getCourseCategory().getCategoryName())) return false;
        }
        return true;
    }

    private boolean isTheCourseIdUnique(int id){

        for(Course course : courseDao.getCourseListFromDatabase())
        {
            if (id == course.getCourseId()) return false;
        }
        return true;
    }

}

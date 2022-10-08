package kodlamaioHomepage.dataAccess;

import kodlamaioHomepage.entities.Category;
import kodlamaioHomepage.entities.Course;
import kodlamaioHomepage.entities.Instructor;

import java.util.List;

public interface IBaseDao {

    void addCourseToDatabase(Course course);

    List<Course> getCourseListFromDatabase();

    void addCategoryToDatabase(Category category);

    List<Category> getCategoryListFromDatabase();

    void addInstructorToDatabase(Instructor instructor);

    List<Instructor> getInstructorListFromDatabase();
}

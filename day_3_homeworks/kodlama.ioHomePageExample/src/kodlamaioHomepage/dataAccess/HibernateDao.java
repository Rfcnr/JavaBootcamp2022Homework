package kodlamaioHomepage.dataAccess;

import kodlamaioHomepage.entities.Category;
import kodlamaioHomepage.entities.Course;
import kodlamaioHomepage.entities.Instructor;

import java.util.List;

public class HibernateDao implements IBaseDao{

    @Override
    public void addCourseToDatabase(Course course) {
        DatabaseSimulation.courses.add(course);
    }

    @Override
    public List<Course> getCourseListFromDatabase() {
        return DatabaseSimulation.courses;
    }

    @Override
    public void addCategoryToDatabase(Category category) {
        DatabaseSimulation.categories.add(category);
    }

    @Override
    public List<Category> getCategoryListFromDatabase() {
        return DatabaseSimulation.categories;
    }

    @Override
    public void addInstructorToDatabase(Instructor instructor) {
        DatabaseSimulation.instructors.add(instructor);
    }

    @Override
    public List<Instructor> getInstructorListFromDatabase() {
        return DatabaseSimulation.instructors;
    }
}

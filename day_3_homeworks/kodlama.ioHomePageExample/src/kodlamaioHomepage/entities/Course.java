package kodlamaioHomepage.entities;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private Instructor courseInstructor;
    private Category courseCategory;

    public Course(int courseId, String courseName, double coursePrice, Instructor courseInstructor, Category courseCategory) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseInstructor = courseInstructor;
        this.courseCategory = courseCategory;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Instructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }
}

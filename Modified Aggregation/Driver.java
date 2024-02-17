public class Driver 
{
    public static void main(String[] args) 
    {
        Course course = new Course("Software Engineering");
        course.addTheCourseInstructor(new Instructor("Nima", "Davarpanah", "3-2636"));
        course.addTheCourseInstructor(new Instructor("Salam", "Salloum", "8 Building 8"));
        course.addTheCourseTextbook(new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"));
        course.addTheCourseTextbook(new Textbook("Essentials of Software Engineering", "Frank F. Tsui", "Jones & Bartlett Learning"));
        course.printCourseDetail();
    }
}
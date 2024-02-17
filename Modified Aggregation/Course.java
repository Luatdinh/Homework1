import java.util.ArrayList;
import java.util.List;

class Course
{
    private String name;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String name)
    {
        this.name = name;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

    public void addTheCourseInstructor(Instructor instructor) 
    {
        instructors.add(instructor);
    }

    public void addTheCourseTextbook(Textbook textbook) 
    {
        textbooks.add(textbook);
    }

    public void printCourseDetail() 
    {
        System.out.println("--Course--");
        System.out.println("- Course's title is " + name + ".");

        int i = 0;
        int order = 1;
        
        while (i < instructors.size()) 
        {
            Instructor instructor = instructors.get(i);
            Textbook textbook = textbooks.get(i);
            System.out.println("-- #" + order +" Instructor--");
            System.out.print("- Instructor's name is " + instructor.getInstructorFirstName());
            System.out.println(" "  + instructor.getInstructorLastName() + "."); 
            System.out.println("- Office's number: " + instructor.getInstructorOfficeNumber() + ".");
            System.out.println("-- #" + order + " Textbook--");
            System.out.println("- Textbook's title is " + textbook.getTextbookTitle() + ".");
            System.out.println("- TextBook's author is " + textbook.getTextbookAuthor() + ".");
            System.out.println("- TextBook's publisher is  "+ textbook.getTextbookPublisher() + ".");
            i++;
            order++;
        }
    }
}
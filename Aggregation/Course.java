class Course 
{
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) 
    {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void printCourseDetails() 
    {
        System.out.println("--Course--");
        System.out.println("- Course's title is " + name + ".");
        System.out.println("--Instructor--");
        System.out.print("- Instructor's name is " + instructor.getInstructorFirstName());
        System.out.println(" "  + instructor.getInstructorLastName() + "."); 
        System.out.println("- Office's number: " + instructor.getInstructorOfficeNumber() + ".");
        System.out.println("--TextBook--");
        System.out.println("- Textbook's title is " + textbook.getTextbookTitle() + ".");
        System.out.println("- TextBook's author is " + textbook.getTextbookAuthor() + ".");
        System.out.println("- TextBook's publisher is  "+ textbook.getTextbookPublisher() + ".");
    }
}

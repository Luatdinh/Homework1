class File 
{
    private String fileName;

    public File(String fileName) 
    {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }

    public void print(int moveToTheRight) 
    {
        System.out.print(" ".repeat(moveToTheRight));
        System.out.println("File: " + fileName);
    }
}
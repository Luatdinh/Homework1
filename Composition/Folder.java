import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Folder 
{
    private String name;
    private List<File> file;
    private List<Folder> subFolder;

    public Folder(String name) 
    {
        this.name = name;
        this.file = new ArrayList<>();
        this.subFolder = new ArrayList<>();
    }

    public void addSubFolderToFolder(Folder folder) 
    {
        subFolder.add(folder);
    }

    public void addFileToFolder(File file) 
    {
        this.file.add(file);
    }

    public void setFolderName(String name) 
    {
        this.name = name;
    }

    public void setSubFolder(List<Folder> subFolder) 
    {
        this.subFolder = subFolder;
    }

    public void setFile(List<File> file)
    {
        this.file = file;
    }

    public String getFolderName() 
    {
        return name;
    }

    public List<Folder> getSubFolder() 
    {
        return subFolder;
    }
     
    public List<File> getFile() 
    {
        return file;
    }
    
    public void printFile(int moveToTheRight)
    {
        for (File files : file) 
        {
            int toTheRightFourTimes = moveToTheRight + 4;
            files.print(toTheRightFourTimes); 
        }
    }

    public void printFolder(int moveToTheRight)
    {
        for (Folder subFolders : subFolder) 
        {
            int toTheRightFourTimes = moveToTheRight + 4;
            subFolders.printStructure(toTheRightFourTimes); 
        }
    }

    public void printStructure(int moveToTheRight) 
    {
        System.out.println(" ".repeat(moveToTheRight) + "Folder: " + name);
        
        printFolder(moveToTheRight);
        printFile(moveToTheRight);
    }

    public void deleteFolder(String name) 
    {
        subFolder = subFolder.stream().filter(subFolder->!subFolder.getFolderName().equals(name)).collect(Collectors.toList());
    }

}

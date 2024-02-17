public class Driver 
{
   
    public static void main(String[] args) 
    {
        Folder php_demo1 = new Folder("php_demo1");
        Folder source = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        source.addSubFolderToFolder(phalcon);
        Folder app = new Folder("app");
        String[] appSubFolders = {"config", "controllers", "library", "migrations", "models", "views"};

        for (String folderName : appSubFolders) {
           app.addSubFolderToFolder(new Folder(folderName));
        }

        source.addSubFolderToFolder(app); 
        Folder cache = new Folder("cache");
        source.addSubFolderToFolder(cache);
        Folder publicFolder = new Folder("public");
        String[] publicFiles = {".htaccess", "htrouter.php", "index.html"};

        for (String fileName : publicFiles) {
           source.addFileToFolder(new File(fileName));
        }

        source.addSubFolderToFolder(publicFolder);
        php_demo1.addSubFolderToFolder(source);

        String[] phpDemo1SubFolders = {"Include Path", "Remote Files"};

        for (String folderName : phpDemo1SubFolders) {
           php_demo1.addSubFolderToFolder(new Folder(folderName));
        }  

        System.out.println("--Origianl Structure Of Folders--");
        php_demo1.printStructure(0);
        System.out.println();

        source.deleteFolder("app");
        System.out.println("--After Deleting The Folder App--");
        php_demo1.printStructure(0);
        System.out.println();

        source.deleteFolder("public");
        System.out.println("--After Deleting The Folder Public --");
        php_demo1.printStructure(0);

    }
    
}
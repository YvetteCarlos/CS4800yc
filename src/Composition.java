
public class Composition {
    public static void main(String[] args){
        System.out.println("All subfolders and files");

    }
}
class Folder{
    private String folder;

    public String getFolderName() {
        return folder;
    }

    public void setFolderName(String folderName) {
        this.folder = folder;

    }

     System.out.println("All subfolders and files" + folder);

}

class File{
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
System.out.println("File name:")

}

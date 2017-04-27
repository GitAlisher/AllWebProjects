/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

/**
 *
 * @author Alisher
 */
public class FileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Folder root = new Folder();
        File f = new File();
        f.rename("qwerty");
        f.retype("cpp");
        f.setSize(3);
        root.paste(f);
        
        Folder ff = new Folder();
        ff.rename("Folder2");
        File s = new File();
        s.rename("JavaApp");
        s.retype("java");
        s.setSize(10);
        ff.paste(s);
        f.rename("NewTxt");
        f.retype("txt");
        f.setSize(5);
        
        Folder NewFolder = new Folder();
        NewFolder.rename("Folder2");
        File NewFile = new File();
        NewFile.rename("NewJSP");
        NewFile.retype("jsp");
        NewFile.setSize(7);
        NewFolder.paste(NewFile);
        
        ff.paste(NewFolder);
        root.paste(ff);
        root.paste(f);
        
        root.show(0);
    }
    
}

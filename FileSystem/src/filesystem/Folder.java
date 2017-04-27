/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisher
 */
public class Folder {
    private String Name;
    private int Size;
    
    List<Folder> childFolder;
    List<File> childFile;
    
    public Folder(){
        Name = "New Folder";
        Size = 0;
        childFile = new ArrayList<File>();
        childFolder = new ArrayList<Folder>();
    }
/*    protected Folder clone() throws CloneNotSupportedException {
        return (Folder)super.clone();
    } */   
    public void paste(File f){
        Size += f.getSize();
        File New = new File();
        
        New.rename(f.getName());
        New.retype(f.getType());
        New.setSize(f.getSize());
        
        childFile.add(New);
    }
    
    public void paste(Folder f) throws CloneNotSupportedException {
        Size += f.getSize();
        //Folder New = new Folder();
        //New = f.clone();
        childFolder.add(f);
    }
    public void remove(File f) {
        Size -= f.getSize();
        childFile.remove(f);
    }
    public void remove(Folder f) {
        Size -= f.getSize();
        childFolder.remove(f);
    }
    public void rename(String str) {
        Name = str;
    }
    public int getSize() {
        return Size;
    }
    public String getName() {
        return Name;
    }
    public void show(int tab) {
        System.out.println("Name Folder " + Name + " Size " + Size);
        for (int i = 0; i < childFile.size(); i++) {
            for (int j = 0; j < tab + 1; j++) 
                System.out.print("        ");
            System.out.println("Name of File " + childFile.get(i).getName() + " Size " + childFile.get(i).getSize() + " Type " + childFile.get(i).getType());
        }
        for (int i = 0; i < childFolder.size(); i++) {
            for (int j = 0; j < tab + 1; j++) 
                System.out.print("        ");
            childFolder.get(i).show(tab + 1);
            //System.out.println("Name of File " + childFile.get(i).getName() + " Size " + childFile.get(i).getSize() + " Type " + childFile.get(i).getType());
        }
    }
} 

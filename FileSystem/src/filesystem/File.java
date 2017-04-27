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
public class File {
    private String Name;
    private int Size;
    private String type;
    
    public File() {
        Name = "New File";
        Size = 0;
        type = "txt";
    }
    public void rename(String str) {
        Name = str;
    }
    public void retype(String str) {
        type = str;
    }
    public void setSize(int sz) {
        Size = sz;
    }
    public String getName() {
        return Name;
    }
    public int getSize() {
        return Size;
    }
    public String getType() {
        return type;
    }
}

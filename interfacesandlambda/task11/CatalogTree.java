package com.nzavod.interfacesandlambda.task11;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class CatalogTree {
    /*
    список подкаталогов
     */
    public static File[] getSubDirectories(File file, FileFilter fileFilter){
        List<File> result = new ArrayList<>();
        File [] subDirectories = file.listFiles(fileFilter);
        for(int i = 0; i < subDirectories.length; i++){
            if (subDirectories[i].isDirectory()){
                result.add(subDirectories[i]);
            }
        }
        return (File[]) result.toArray();
    }
}

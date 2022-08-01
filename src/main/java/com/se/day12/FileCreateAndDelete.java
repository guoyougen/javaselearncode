package com.se.day12;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @projectname: learn
 * @packname: com.se.day12
 * @classname: FileCreateAndDelete
 * @author: gyg
 * @date: 2022/7/23 下午 3:37
 * @version: 1.0
 * @description: TODO
 */

public class FileCreateAndDelete {
    public static void main(String[] args) {
        String tempDir=System.getProperty("java.io.tmpdir");
        if(tempDir== null) {
            System.out.println("cuowu");
            return;
        }
        File tempFile = new File(tempDir);
        LocalDate date = LocalDate.now();
        String dirName = DateTimeFormatter.ofPattern("yyyyMMdd").format(date);
        File dirNameFile = new File(tempFile,dirName);
        if(dirNameFile.mkdir()){

        }

    }
}

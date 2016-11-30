package com.hyl.javademo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 1. 作用  遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 * 4. 思路： 遍历文件夹
 */

public class Test1Demo {

    public static void main(String[] args) {
        File file = new File("G:\\下载down");
        list(file,0);

    }

    public static String getSpace(int level)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<level;i++)
            sb.append("-");
        return sb.toString();
    }
    public static void list(File dir,int level)
    {
        File [] list = dir.listFiles();
        System.out.println("dir "+getSpace(level)+dir.getName());
        level++;
        if(list!=null)
        {
            for(File f : list)
            {
                if(f.isDirectory())
                    list(f,level);
                else
                    System.out.println("file "+getSpace(level)+f.getName());
            }
        }
    }
    public static void list(File file)
    {
        File files[] = file.listFiles(new FilenameFilter() {//定义一个内部类实现接口FilenameFilter，而不用再实现一个新的类去实现接口

            public boolean accept(File f,String name)
            {
                File tempfile = new File (f,name);
                if(tempfile.isDirectory())
                    return true;
                return name.endsWith(".txt");

            }
        });
        if(files != null)
        {
            for(File f : files)
            {
                if(f.isDirectory())
                    list(f);
                else
                    System.out.println(f.getAbsolutePath());
            }
        }
    }
}

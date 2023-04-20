package recursion;

import java.io.File;

/**
 * 删除文件夹及其文件 实际删除的是文件夹中的文件 文件夹不占空间
 */
public class DeleteFiles {
    public static void main(String[] args) {
        /*获取文件对象*/
        File f = new File("C:\\Users\\User\\Desktop\\测试");
        deletefile(f);
    }

    /**
     * 删除文件方法
     */
    public static void deletefile(File f) {
        if (f == null) {
            return;
        }
        if (f.isFile()) {
            f.delete();
            return;
        }
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
               /* System.out.println(file);*/
                /*如果是文件*/
                if(file.isFile()){
                    file.delete();
                }else {
                    /*如果是文件夹*/
                    deletefile(file);
                }

            }
            /*循环结束 删除文件夹*/
            f.delete();
        }

    }
}

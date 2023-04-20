package recursion;

import java.io.File;

/**
 * 统计文件大小
 */
public class ReturnFileLen {
    public static void main(String[] args) {
        File f = new File("D:\\day10");
        long length = getLength(f);
        System.out.println(length);
    }

    public static long getLength(File f) {
        long len = 0;
        if (f == null) {
            return 0;
        }
        if (f.isFile()) {
            return f.length();

        }
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    len += file.length();
                } else {
                    len += getLength(file);
                }
            }

        }
        return len;
    }
}

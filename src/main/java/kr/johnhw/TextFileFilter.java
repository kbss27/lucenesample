package kr.johnhw;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by hyunwoo on 2017-08-14.
 */
public class TextFileFilter implements FileFilter {

    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}

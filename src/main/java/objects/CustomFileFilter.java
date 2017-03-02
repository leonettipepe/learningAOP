package objects;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by leonid on 02.03.2017.
 */
public class CustomFileFilter implements FilenameFilter {

    private String extension;

    public CustomFileFilter(String extension) {
        this.extension = extension;
    }

    public boolean accept(File dir, String name) {
        return name.toUpperCase().endsWith("." + extension.toUpperCase());
    }
}

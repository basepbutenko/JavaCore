package files;

import java.io.File;
import java.io.FilenameFilter;

public class TxtFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name . endsWith ( ".txt" );
    }
}

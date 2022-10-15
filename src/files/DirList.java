package files;

import files.TxtFileNameFilter;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/Users/oleksijbutenko/IdeaProjects/aaa";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Directory" + dirname);
            String s[] = f1.list(new TxtFileNameFilter());
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is dir");
                } else {
                    System.out.println(s[i] + " is file");
                }
            }
        } else {

            System.out.println(dirname + "is not a  dir");
        }

// пример анонимного класса
        String s1[] = f1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });



// пример  лямбды сокращенно
        String s2[] = f1.list((File dir, String name) -> false);


// пример  лямбды с телом
        String s4[] = f1.list((File dir, String name) -> {
            ///
            return false;
        });
    }
}

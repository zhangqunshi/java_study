import java.util.*;
import java.io.File;
import java.util.regex.*;
import java.io.FilenameFilter;

public final class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles: " + PPrint.pformat(files);
        }
    }


    public static TreeInfo walk(String start, String regex) {
        return recurseDir(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDir(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDir(start, ".*");
    }

    public static TreeInfo walk(String start) {
        System.out.println("walk start " + start);
        return recurseDir(new File(start), ".*");
    }


    static TreeInfo recurseDir(File startDir, String regex) {
        System.out.println("startDir: " + startDir + ", regex: " + regex);
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            //System.out.println("item: " + item);
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDir(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length == 0) {
            System.out.println(walk("."));
        } else {
            for (String arg : args) {
                //System.out.println("==80==" + arg);
                System.out.println(walk(arg));
            }
        }
    }

}


class PPrint {
    public static String pformat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (Object item : c) {
            if (c.size() != 1) {
                sb.append("\n ");
            }
            sb.append(item);
        }
        if (c.size() != 1) {
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void pprint(Collection<?> c) {
        System.out.println(pformat(c));
    }

    public static void pprint(Object[] c) {
        System.out.println(pformat(Arrays.asList(c)));
    }
}

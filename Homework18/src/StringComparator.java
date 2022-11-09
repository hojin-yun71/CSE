import java.util.Comparator;

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if (s1.compareTo(s2) < 0) {

            return 1;

        } else if (s1.compareTo(s2) > 0) {

            return -1;

        } else {

            return 0;
        }
    }
}

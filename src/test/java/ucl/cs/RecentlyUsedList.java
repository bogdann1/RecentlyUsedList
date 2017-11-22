package ucl.cs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bogdannitescu on 21/11/2017.
 */
public class RecentlyUsedList {
    private List<String> content = new ArrayList<>();

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public void add(String element) {
        content.remove(element);
        content.add(0, element);
    }

    public Integer size() {
        return content.size();
    }

    public String get(int i) {
        return content.get(i);
    }
}

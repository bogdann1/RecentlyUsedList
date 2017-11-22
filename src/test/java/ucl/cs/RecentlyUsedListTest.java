package ucl.cs;

import org.junit.Test;

import java.util.PriorityQueue;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

    final RecentlyUsedList list = new RecentlyUsedList();

  @Test
    public void isInitialisedEmpty() {
    assertTrue(list.isEmpty());
    assertThat(list.size(), is(0));
  }

  @Test
    public void allowsItemToBeAdded() {
      list.add("hello");
      assertFalse(list.isEmpty());
      assertThat(list.size(), is(1));
      list.add("goodbye");
      assertThat(list.size(), is(2));
  }

  @Test
    public void keepsTheMostRecentItemAtTheTopOfTheList() {
      list.add("cat");
      list.add("dog");
      assertThat(list.get(0), is("dog"));
      assertThat(list.get(1), is("cat"));
  }

  @Test
    public void preventDubplicates() {
      list.add("cat");
      list.add("cat");
      assertThat(list.size(), is(1));
  }

  @Test
    public void MovesTheMostRecentElementAtTheTopOfTheListIfDuplicateAdded() {
      list.add("one");
      list.add("two");
      list.add("one");
      assertThat(list.size(), is(2));
      assertThat(list.get(0), is("one"));
  }
}

import ac.c4q.nyc.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyLinkedListTest {
    @Test
    public void TestAdd(){
        MyLinkedList<String> list = new MyLinkedList<>();
        assertEquals(0, list.size());
        list.add("hello world");
        assertEquals(1, list.size());
        list.get(0);
        String item = list.get(0);
        assertEquals("hello world", item);
    }
}

package algorith.opti;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftResultTest {

    @Test
    public void getTallestFromLeftSideTestEmpty() {
        int[] data = {};
        int[] result = processData(data);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void gienDataWithJustOneElementWillReturnAnArrayWithSameElement() {
        int[] data = {55};
        int[] result = processData(data);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(55, result[0]);
    }

    private int[] processData(int[] data) {
        int[] result = new int[data.length];
        if (result.length > 0) {
            result[0] = data[0];
        }
        return result;
    }

    @Test
    public void name() {
        InternalPjo internalPjo1 = new InternalPjo();
        InternalPjo internalPjo2 = new InternalPjo();

        List <InternalPjo> list= new ArrayList<>();
        list.add(internalPjo1);
        list.add(internalPjo2);

        list.stream().map(internalPjo -> internalPjo.name = getString(internalPjo))
                .collect(Collectors.toList());
        Assert.assertNotNull(list);

        /*List<String> collect = Stream.of(internalPjo1, internalPjo2)
                .map(internalPjo -> internalPjo.name = getString(internalPjo))
                .collect(Collectors.toList());
        Assert.assertNotNull(collect);*/
    }

    private String getString(InternalPjo internalPjo) {
        internalPjo.apellido = "Suarez";
        return internalPjo.name = "Roberto";
    }

    private class InternalPjo {
        public String name;
        public String apellido;
    }
}

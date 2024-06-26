import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Flattener {

    <T> List<T> flatten(List<T> list) {
        return list.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
    }

}

package fas.ict.day05.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CrudController<K, T> {
    private Map<K, T> objects = new HashMap<>();

    public Map<K, T> getMap() {
        return objects;
    }

    @GetMapping("/")
    public Map<K, T> getAll() {
        return objects;
    }

    @GetMapping("/{id}")
    public T get(@PathVariable("id") K id) {
        return objects.get(id);
    }
}

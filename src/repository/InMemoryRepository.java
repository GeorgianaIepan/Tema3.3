package repository;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryRepository<T> implements CrudRepository<T> {

    protected List<T> inMemoryList;

    public InMemoryRepository() {
        this.inMemoryList = new ArrayList<>();
    }

    @Override
    public T create(T obj) {
        this.inMemoryList.add(obj);
        return obj;
    }

    @Override
    public void delete(T obj) {
        this.inMemoryList.remove(obj);
    }

    @Override
    public T getOne(int object) {
        return this.inMemoryList.get(object);
    }

    @Override
    public List<T> getAll() {
        return this.inMemoryList;
    }
}

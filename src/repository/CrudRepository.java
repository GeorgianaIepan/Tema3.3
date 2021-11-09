package repository;

import java.util.List;

public interface CrudRepository<T> {

    T create(T obj);

    void delete(T obj);

    T getOne(int objrct);

    List<T> getAll();

    T update(T obj);


}

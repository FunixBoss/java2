package idao;

import java.util.List;

public interface DAO<T> {
	T select(Integer id);
	List<T> selectAll();
	int insert(T t);
	int delete(T t);
}

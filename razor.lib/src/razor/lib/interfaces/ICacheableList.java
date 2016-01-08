package razor.lib.interfaces;

import java.util.List;

public interface ICacheableList<T> extends ICacheable {	
	void addItem(T item);	
	public List<T> getItemList();
	public T getItem();
	void clear();	
}

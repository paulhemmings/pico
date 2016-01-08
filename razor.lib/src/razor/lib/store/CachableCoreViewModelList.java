package razor.lib.store;

import razor.lib.interfaces.ICacheableList;
import razor.lib.interfaces.ICoreViewModel;

public class CachableCoreViewModelList extends SimpleCachableList<ICoreViewModel> implements ICacheableList<ICoreViewModel> {

	public CachableCoreViewModelList(){
		super();
	}
	
	public CachableCoreViewModelList(String name){
		super(name);
	}
}


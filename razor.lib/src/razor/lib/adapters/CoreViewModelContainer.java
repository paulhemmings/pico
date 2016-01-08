package razor.lib.adapters;

import razor.lib.interfaces.ICoreViewModel;
import razor.lib.interfaces.ICoreViewModelContainer;

public class CoreViewModelContainer implements ICoreViewModelContainer {
	
	private ICoreViewModel containedModel = null;

	@Override
	public ICoreViewModel getModel() { return this.containedModel;}

	@Override
	public void setModel(ICoreViewModel model) {this.containedModel = model;}
	
}

package razor.lib.interfaces;


public interface IModelHolder {
	void Initialise(Integer id,ICoreActivity activity);
	void Update();
	void Clear();
	IModelItem getItem();
}

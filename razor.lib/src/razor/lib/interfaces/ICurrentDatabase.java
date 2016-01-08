package razor.lib.interfaces;

public interface ICurrentDatabase {
	IModelProvider getProvider(Integer modelType);	
	void close();
}

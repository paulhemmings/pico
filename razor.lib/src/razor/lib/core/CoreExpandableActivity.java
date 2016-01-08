package razor.lib.core;

import razor.lib.R;
import razor.lib.adapters.CoreViewModelExpandableListAdapter;
import razor.lib.interfaces.ICoreActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

public class CoreExpandableActivity extends CoreActivity implements ICoreActivity {
	
	protected ViewHolder holder = null;
	protected CoreViewModelExpandableListAdapter listAdapter = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// call create
        super.onCreate(savedInstanceState); 
        // load the list view
        setContentView(R.layout.lib_expandable_template);   
        // initialise the template view holder
        this.holder = new ViewHolder(this);
    }
    
    public class ViewHolder{
    	public ExpandableListView expandableView = null;
    	public View headerView = null;
    	public View footerView = null;

    	public ViewHolder(Activity activity){
            this.expandableView = (ExpandableListView) activity.findViewById(R.id.lib_expandable_template_list);
            //this.headerView = activity.findViewById(R.id.lib_expandable_template_header_include);
            //this.footerView = activity.findViewById(R.id.lib_expandable_template_footer_include);    		
    	}
    }
}

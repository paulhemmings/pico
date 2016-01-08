package razor.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import razor.lib.R;

public class ListFooterView extends RelativeLayout {

	public ListFooterView(Context context, AttributeSet attrs) {
		super(context, attrs);
		inflateLayout(context);
	}
	
	public ListFooterView(Context context) {
		super(context);
		inflateLayout(context);
	}
	private TextView tvFoundMessages;
	private View vLoading;
	//private Button btnLoadMore;
	
	private void inflateLayout(Context context) {
		LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(R.layout.lib_footer_view, this);
		
		tvFoundMessages = (TextView)view.findViewById(R.id.textView_foundMessages);
		vLoading = view.findViewById(R.id.include_loading);
		//btnLoadMore = (Button)view.findViewById(R.id.button_loadMore);
	}

	public void showLoading(boolean show) {
		if (show) {
			vLoading.setVisibility(View.VISIBLE);
			tvFoundMessages.setVisibility(View.GONE);
			//showLoadMore(false);
		} else {
			vLoading.setVisibility(View.GONE);
			tvFoundMessages.setVisibility(View.VISIBLE);
			//showLoadMore(true);
		}
	}

	public void setMessage(String message) {
		tvFoundMessages.setText(message);
	}
	/*
	public void showLoadMore(boolean show) {
		if (show) btnLoadMore.setVisibility(View.VISIBLE);
		else btnLoadMore.setVisibility(View.GONE);
	}
	
	public void setLoadMoreOnClickListener(OnClickListener listener) {
		btnLoadMore.setOnClickListener(listener);
	}
	*/
}

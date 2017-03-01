package chiachen.example.com.recyclerview_demo.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import chiachen.example.com.recyclerview_demo.R;

/**
 * Created by chiachen on 2017/3/1.
 */

public class ViewHolderColor extends RecyclerView.ViewHolder {

	public View colorBlock;

	public ViewHolderColor(View itemView) {
		super(itemView); // Must call super() first
		colorBlock = (View) itemView.findViewById(R.id.colorBlock);
	}
}
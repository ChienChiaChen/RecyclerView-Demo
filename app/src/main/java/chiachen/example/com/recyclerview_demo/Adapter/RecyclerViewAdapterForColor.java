package chiachen.example.com.recyclerview_demo.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import chiachen.example.com.recyclerview_demo.Data.ColorData;
import chiachen.example.com.recyclerview_demo.R;
import chiachen.example.com.recyclerview_demo.ViewHolder.ViewHolderColor;

/**
 * Created by chiachen on 2017/3/1.
 */

public class RecyclerViewAdapterForColor extends RecyclerView.Adapter<ViewHolderColor>{
	private List<ColorData> dataItems= Collections.emptyList();

	public RecyclerViewAdapterForColor(List<ColorData> dataItems) {
		this.dataItems = dataItems;
	}

	@Override
	public ViewHolderColor onCreateViewHolder(ViewGroup parent, int viewType) {
		View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_layout, null);
		return new ViewHolderColor(layoutView);
	}

	@Override
	public void onBindViewHolder(ViewHolderColor holder, int position) {
		ColorData data = dataItems.get(position);
		ViewHolderColor viewHolderColor = holder;
		viewHolderColor.colorBlock.setBackgroundColor(data.getColor());
	}

	@Override
	public int getItemCount() {
		return dataItems.size();
	}

}

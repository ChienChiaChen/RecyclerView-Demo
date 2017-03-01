package chiachen.example.com.recyclerview_demo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import chiachen.example.com.recyclerview_demo.Adapter.RecyclerViewAdapterForColor;
import chiachen.example.com.recyclerview_demo.Data.ColorData;
import chiachen.example.com.recyclerview_demo.R;

/**
 * Created by chiachen on 2017/3/1.
 */

public class GridActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gridview);
		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_color);
		// Creating new adapter object
		RecyclerViewAdapterForColor myAdapter = new RecyclerViewAdapterForColor(getDatas());
		recyclerView.setAdapter(myAdapter);

		// Setting the layoutManager
		// recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

	}

	public List<ColorData> getDatas() {
		List<ColorData> dataItems = new ArrayList<>();
		dataItems.add(new ColorData("#3F51B5"));
		dataItems.add(new ColorData("#E91E63"));
		dataItems.add(new ColorData("#FF5722"));
		dataItems.add(new ColorData("#4CAF50"));
		dataItems.add(new ColorData("#607D8B"));
		dataItems.add(new ColorData("#00BCD4"));
		dataItems.add(new ColorData("#FFC107"));
		dataItems.add(new ColorData("#795548"));
		dataItems.add(new ColorData("#03A9F4"));
		dataItems.add(new ColorData("#F44336"));
		dataItems.add(new ColorData("#607D8B"));
		return dataItems;
	}
}

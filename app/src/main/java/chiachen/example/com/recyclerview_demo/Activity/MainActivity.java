package chiachen.example.com.recyclerview_demo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import chiachen.example.com.recyclerview_demo.Adapter.RecyclerViewAdapter;
import chiachen.example.com.recyclerview_demo.Listener.CustomRVItemTouchListener;
import chiachen.example.com.recyclerview_demo.Data.Data;
import chiachen.example.com.recyclerview_demo.R;
import chiachen.example.com.recyclerview_demo.Listener.RecyclerViewItemClickListener;

public class MainActivity extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
		List<Data> data = fill_with_data();

		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
		RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplication());
		recyclerView.setAdapter(adapter);
		// recyclerView.setLayoutManager(new GridLayoutManager(this,3));
		recyclerView.setLayoutManager(new LinearLayoutManager(this));

		RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
		itemAnimator.setAddDuration(1000);
		itemAnimator.setRemoveDuration(1000);
		recyclerView.setItemAnimator(itemAnimator);
		recyclerView.addOnItemTouchListener( new CustomRVItemTouchListener( this, recyclerView, new RecyclerViewItemClickListener(){
			@Override
			public void onClick(View view, int position){
				Toast.makeText( view.getContext(), "onClick " + position, Toast.LENGTH_SHORT ).show();
			}

			@Override
			public void onLongClick(View view, int position){
				Toast.makeText( view.getContext(), "onLongClick " + position, Toast.LENGTH_SHORT ).show();
			}
		} ) );

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "GridView");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (Menu.NONE == item.getGroupId()) {
			Intent intent = new Intent(MainActivity.this, GridActivity.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}

	public static List<Data> fill_with_data() {

		List<Data> data = new ArrayList<>();

		data.add(new Data("Batman vs Superman", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.mipmap.ic_action_movie));
		data.add(new Data("X-Men: Apocalypse", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.mipmap.ic_action_movie));
		data.add(new Data("Captain America: Civil War", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.mipmap.ic_action_movie));
		data.add(new Data("Kung Fu Panda 3", "After reuniting with his long-lost father, Po  must train a village of pandas", R.mipmap.ic_action_movie));
		data.add(new Data("Warcraft", "Fleeing their dying home to colonize another, fearsome orc warriors invade the peaceful realm of Azeroth. ", R.mipmap.ic_action_movie));
		data.add(new Data("Alice in Wonderland", "Alice in Wonderland: Through the Looking Glass ", R.mipmap.ic_action_movie));

		return data;
	}
}

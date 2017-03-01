package chiachen.example.com.recyclerview_demo.Listener;

import android.view.View;

/**
 * Created by Jason_Chien on 2017/3/1.
 */

public interface RecyclerViewItemClickListener{
	void onClick(View view, int position);

	void onLongClick(View view, int position);
}

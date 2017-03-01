package chiachen.example.com.recyclerview_demo.ViewHolder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import chiachen.example.com.recyclerview_demo.R;

/**
 * Created by Jason_Chien on 2017/3/1.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
	public CardView cv;
	public TextView title;
	public TextView description;
	public ImageView imageView;
	public ViewHolder(View itemView){
		super( itemView );
		cv = (CardView) itemView.findViewById(R.id.cardView);
		title = (TextView) itemView.findViewById(R.id.title);
		description = (TextView) itemView.findViewById(R.id.description);
		imageView = (ImageView) itemView.findViewById(R.id.imageView);
	}
}

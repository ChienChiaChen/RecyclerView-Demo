package chiachen.example.com.recyclerview_demo.Data;

import android.graphics.Color;

/**
 * Created by chiachen on 2017/3/1.
 */

public class ColorData {
	private int color;

	public ColorData(String color) {
		this.color = Color.parseColor(color);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}

package org.alfonz.samples.alfonzgraphics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.alfonz.arch.widget.ToolbarIndicator;
import org.alfonz.samples.R;
import org.alfonz.samples.alfonzarch.BaseActivity;


public class GraphicsSampleActivity extends BaseActivity
{
	public static Intent newIntent(Context context)
	{
		Intent intent = new Intent(context, GraphicsSampleActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}


	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graphics_sample);
		setupActionBar(ToolbarIndicator.BACK);
	}
}

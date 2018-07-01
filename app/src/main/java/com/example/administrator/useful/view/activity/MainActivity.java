package com.example.administrator.useful.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.example.administrator.useful.R;
import com.example.administrator.useful.view.fragment.InfoFragment;
import com.example.administrator.useful.view.fragment.MoneyFragment;
import com.example.administrator.useful.view.fragment.MovieFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


	@BindView(R.id.rb_1)
	RadioButton rb1;
	@BindView(R.id.rb_2)
	RadioButton rb2;
	@BindView(R.id.rb_3)
	RadioButton rb3;
	@BindView(R.id.rb_4)
	RadioButton rb4;
	@BindView(R.id.rb_5)
	RadioButton rb5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
		init();
	}


	private void init() {
		MoneyFragment moneyFragment = new MoneyFragment();
		MovieFragment movieFragment = new MovieFragment();
		InfoFragment infoFragment = new InfoFragment();

		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		transaction
				.add(R.id.fl, moneyFragment, "moneyFragment")
				.add(R.id.fl, movieFragment, "movieFragment")
				.add(R.id.fl, infoFragment, "infoFragment")
				.hide(moneyFragment)
				.hide(infoFragment).commit();


	}

	@OnClick({R.id.rb_1, R.id.rb_2, R.id.rb_3, R.id.rb_4, R.id.rb_5})
	public void onViewClicked(View view) {
		switch (view.getId()) {
			case R.id.rb_1:
				break;
			case R.id.rb_2:
				break;
			case R.id.rb_3:
				break;
			case R.id.rb_4:
				break;
			case R.id.rb_5:
				break;
		}
	}
}

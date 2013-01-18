package com.example.helloworld.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.example.helloworld.MainActivity;

public class HelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private TextView view;
	private Object resourceString;

	@SuppressWarnings("deprecation")
	public HelloWorldTest() {
		super("com.example.helloworld", MainActivity.class);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	@Override
	protected void setUp() throws Exception {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.setUp();
		activity = getActivity();

		view = (TextView) activity.findViewById(com.example.helloworld.R.id.textView);
		resourceString = activity.getString(com.example.helloworld.R.string.hello_world);     
	}

	public void testText() throws Exception {
		assertNotNull(view.getText().toString(), resourceString);
	} 

	public void testText2() throws Exception {
		assertEquals(view.getText().toString(), "Hello world!");
	} 

}

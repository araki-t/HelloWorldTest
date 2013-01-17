package com.example.helloworld.test;

import com.example.helloworld.MainActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class HelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    TextView view;
    Object resourceString;
    
    @SuppressWarnings("deprecation")
	public HelloWorldTest() {
		super("com.example.helloworld", MainActivity.class);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		super.setUp();
        activity = getActivity();

        view = (TextView) activity.findViewById(com.example.helloworld.R.id.textView);
        resourceString = activity.getString(com.example.helloworld.R.string.hello_world);     
	}
	
    public void testText() throws Exception {
    	assertNotNull(view.getText().toString(), resourceString);
	} 
    
    public void testText2() throws Exception {
    	assertEquals(view.getText().toString(), "AAA");
	} 

}

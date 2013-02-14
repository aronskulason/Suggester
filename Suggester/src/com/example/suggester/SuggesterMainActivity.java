package com.example.suggester;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class SuggesterMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggester_main);
        
        requestLogin();
        

        Button btn_getSuggestions = (Button) findViewById(R.id.btn_getSuggestions);
    	btn_getSuggestions.setOnClickListener(new View.OnClickListener() {

    		public void onClick(View v) {
    			getSuggestions();
    		}
    	});
       
    	Button btn_trending = (Button) findViewById(R.id.btn_trending);
    	btn_trending.setOnClickListener(new View.OnClickListener() {

    		public void onClick(View v) {
    			getTrending();
    		}
    	});
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_suggester_main, menu);
        return true;
    }
    
    
    private void requestLogin(){
    	//Check whether the user is connected to Facebook or not. 
    }
    
    private void getSuggestions(){
    	
    	
    	
    }
    
    private void getTrending(){
    	
    }
}

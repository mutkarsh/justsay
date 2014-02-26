package co.sdslabs.mdg.justsay;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateBlog extends Activity implements OnClickListener{

	Button bSubmit;
	EditText etTitle,etDescription,etTags;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createblog);
		
		bSubmit=(Button)findViewById(R.id.bSubmit);
		etDescription=(EditText)findViewById(R.id.etDescription);
		etTags=(EditText)findViewById(R.id.etTags);
		etTitle=(EditText)findViewById(R.id.etTitle);
		
		bSubmit.setOnClickListener(this);		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

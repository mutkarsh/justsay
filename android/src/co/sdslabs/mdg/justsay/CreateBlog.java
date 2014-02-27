package co.sdslabs.mdg.justsay;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateBlog extends Activity implements OnClickListener {

	Button bSubmit;
	EditText etTitle, etDescription, etTags;
	final String Title = "Title";

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createblog);

		bSubmit = (Button) findViewById(R.id.bSubmit);
		etDescription = (EditText) findViewById(R.id.etDescription);
		etTags = (EditText) findViewById(R.id.etTags);
		etTitle = (EditText) findViewById(R.id.etTitle);
		// setting onClickListener
		bSubmit.setOnClickListener(this);
	}

	//

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		abc ob1 = new abc();
		ob1.execute();
	}

	class abc extends AsyncTask<String, String, String> {
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			nameValuePairs.add(new BasicNameValuePair("title", etTitle
					.getText().toString()));
			nameValuePairs.add(new BasicNameValuePair("description",
					etDescription.getText().toString()));
			nameValuePairs.add(new BasicNameValuePair("tags", etTags.getText()
					.toString()));
			// nameValuePairs.add(new
			// BasicNameValuePair("location",gpslocation_str));
			InternetData data = new InternetData();
			String out = data.postData(
					"http://bloggy.comeze.com/create_blogposts_backend.php",
					nameValuePairs);
			return null;
		}

	}

}

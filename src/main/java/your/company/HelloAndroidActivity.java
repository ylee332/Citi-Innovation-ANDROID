package your.company;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 Simple Hello World
 */


/**
 * @author    John Smith
 * @version   1.6
 * @since     2015-09-23
 */

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(your.company.R.menu.main, menu);
	return true;
    }

}


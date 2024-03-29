/**
* <ul>
* Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
* Produced by <strong>Dr. Mathias SEGUY</strong> with the smart contribution of <strong>Julien PAPUT</strong>.</br>
* Delivered by <strong>http://android2ee.com/</strong></br>
* Belongs to <strong>Mathias Seguy</strong></br>
* ****************************************************************************************************************</br>
* This code is free for any usage but can't be distribute.</br>
* The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
* The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* For any information (Advice, Expertise, J2EE or Android Training, Rates, Business):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
* Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
* Sa propriété intellectuelle appartient à <strong>Mathias Séguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* Pour tous renseignements (Conseil, Expertise, Formations J2EE ou Android, Prestations, Forfaits):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Merci à vous d'avoir confiance en Android2EE les Ebooks de programmation Android.
* N'hésitez pas à nous suivre sur twitter: http://fr.twitter.com/#!/android2ee
* N'hésitez pas à suivre le blog Android2ee sur Developpez.com : http://blog.developpez.com/android2ee-mathias-seguy/
* *****************************************************************************************************************</br>
* com.android2ee.android.tuto</br>
* 25 mars 2011</br>
*/
package com.android2ee.android.tuto.gui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class StaticTabPane extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// Instanciation of the View
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// Instanciation of the Tab Host the one that contains the tabPanels
		final TabHost tabs = (TabHost) findViewById(R.id.tabhost);
		tabs.setup();
		// Instanciation of the first tab component
		TabHost.TabSpec spec = tabs.newTabSpec("digital");
		spec.setContent(R.id.digital);
		//Definition of the label to display for the tabPanel
		spec.setIndicator("Digital Clock");
		//Adding the first tabPanel to the TabHost
		tabs.addTab(spec);
		
		//Instanciation of the second tab component
		spec = tabs.newTabSpec("analogic");
		spec.setContent(R.id.analog);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Analogic Clock");
		//Adding the second tabPanel to the TabHost
		tabs.addTab(spec);
		//set the current tab
		tabs.setCurrentTab(0);
		//or add a listener
		tabs.setOnTabChangedListener(new OnTabChangeListener() {
			
			@Override
			public void onTabChanged(String tabId) {
				Log.e("StaticTabPane"," the tabId is : "+tabId+" and current is : "+tabs.getCurrentTabTag());
				
			}
		});

    }
}
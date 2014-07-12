/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.formulario_analisi_matematica;

import android.os.Bundle;
import android.widget.LinearLayout;

import org.apache.cordova.*;

import com.google.ads.*;
import android.widget.LinearLayout;

import android.webkit.WebSettings;

public class formulario_analisi_matematica extends DroidGap
{
	private static final String AdMob_Ad_Unit = "ca-app-pub-9416835375998971/1186507842";
    private AdView adView;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
        
        
        adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit); 
        LinearLayout layout = super.root; 
        layout.addView(adView); 
        AdRequest request = new AdRequest();
         
        // Comment this out before publishing.
        request.addTestDevice(AdRequest.TEST_EMULATOR);
        adView.loadAd(request); 
      
        WebSettings ws = super.appView.getSettings();
        ws.setSupportZoom(true);
        ws.setBuiltInZoomControls(true); 
        
    }
}


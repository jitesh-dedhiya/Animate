package app.animate;

/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//import com.example.android.apis.R;

//import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.*;
import android.view.animation.*;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Animate extends GraphicsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SampleView(this));
    }
    
    private static class SampleView extends View {
        private AnimateDrawable mDrawable1,mDrawable2,mDrawable3,
        mDrawable4,mDrawable5,mDrawable6,mDrawable7;

        public SampleView(Context context) {
            super(context);
            setFocusable(true);
            setFocusableInTouchMode(true);

            Drawable dr1 = context.getResources().getDrawable(R.drawable.r1a);
            Drawable dr2 = context.getResources().getDrawable(R.drawable.r2a);
            Drawable dr3 = context.getResources().getDrawable(R.drawable.r3a);
            Drawable dr4 = context.getResources().getDrawable(R.drawable.r4a);
            Drawable dr5 = context.getResources().getDrawable(R.drawable.r5a);
            Drawable dr6 = context.getResources().getDrawable(R.drawable.r6a);
            Drawable dr7 = context.getResources().getDrawable(R.drawable.r7a);
            
            dr1.setBounds(0, 0, dr1.getIntrinsicWidth(), dr1.getIntrinsicHeight());
            dr2.setBounds(0, 0, dr2.getIntrinsicWidth(), dr2.getIntrinsicHeight());
            dr3.setBounds(0, 0, dr3.getIntrinsicWidth(), dr3.getIntrinsicHeight());
            dr4.setBounds(0, 0, dr4.getIntrinsicWidth(), dr4.getIntrinsicHeight());
            dr5.setBounds(0, 0, dr5.getIntrinsicWidth(), dr5.getIntrinsicHeight());
            dr6.setBounds(0, 0, dr6.getIntrinsicWidth(), dr6.getIntrinsicHeight());
            dr7.setBounds(0, 0, dr7.getIntrinsicWidth(), dr7.getIntrinsicHeight());
            
            
            Animation an1 = new TranslateAnimation(0, 250, 0, 250);
            an1.setDuration(4000);
            an1.setRepeatCount(-1);
            an1.initialize(10, 10, 10, 10);
            
            Animation an2 = new TranslateAnimation(250, 0, 0, 250);
            an2.setDuration(4000);
            an2.setRepeatCount(-1);
            an2.initialize(10, 10, 10, 10);
            
            Animation an3 = new TranslateAnimation(0, 250, 125, 125);
            an3.setDuration(4000);
            an3.setRepeatCount(-1);
            an3.initialize(10, 10, 10, 10);
            
            Animation an4 = new TranslateAnimation(125, 125, 250, 0);
            an4.setDuration(4000);
            an4.setRepeatCount(-1);
            an4.initialize(10, 10, 10, 10);
            
            Animation an5 = new TranslateAnimation(250, 0, 250, 0);
            an5.setDuration(4000);
            an5.setRepeatCount(-1);
            an5.initialize(10, 10, 10, 10);
            
           Animation an6 = new TranslateAnimation(0, 250, 250, 0);
           an6.setDuration(4000);
            an6.setRepeatCount(-1);
            an6.initialize(10, 10, 10, 10);
            
            Animation an7 = new TranslateAnimation(250, 0, 125, 125);
            an7.setDuration(4000);
            an7.setRepeatCount(-1);
            an7.initialize(10, 10, 10, 10);
            
            mDrawable1 = new AnimateDrawable(dr1, an1);
            mDrawable2 = new AnimateDrawable(dr2, an2);
            mDrawable3 = new AnimateDrawable(dr3, an3);
            mDrawable4 = new AnimateDrawable(dr4, an4);
            mDrawable5 = new AnimateDrawable(dr5, an5);
            mDrawable6 = new AnimateDrawable(dr6, an6);
            mDrawable7 = new AnimateDrawable(dr7, an7);
            an1.startNow();
            an2.startNow();
            an3.startNow();
            an4.startNow();
            an5.startNow();
            an6.startNow();
            an7.startNow();
        }
        
        @Override protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);

            mDrawable1.draw(canvas);
            mDrawable2.draw(canvas);
            mDrawable3.draw(canvas);
            mDrawable4.draw(canvas);
            mDrawable5.draw(canvas);
            mDrawable6.draw(canvas);
            mDrawable7.draw(canvas);
            invalidate();
        }
    }
}


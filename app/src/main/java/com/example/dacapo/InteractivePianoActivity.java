package com.example.dacapo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InteractivePianoActivity extends AppCompatActivity {
    Button middlec, csharp, d, dsharp, e, f, fsharp, g, gsharp, a, asharp, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive_piano);

        middlec = (Button)findViewById(R.id.middlec);
        final MediaPlayer mpmiddlec = MediaPlayer.create(this, R.raw.middlec);
        middlec.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpmiddlec.start();
            }
        });
        csharp = (Button)findViewById(R.id.csharp);
        final MediaPlayer mpcsharp = MediaPlayer.create(this, R.raw.csharp);
        csharp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpcsharp.start();
            }
        });
        d = (Button)this.findViewById(R.id.d);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.d);
        d.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpd.start();
            }
        });
        dsharp = (Button)this.findViewById(R.id.dsharp);
        final MediaPlayer mpdsharp = MediaPlayer.create(this, R.raw.dsharp);
        dsharp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpdsharp.start();
            }
        });
    }
}

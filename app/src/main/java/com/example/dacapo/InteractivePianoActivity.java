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
        e = (Button)this.findViewById(R.id.e);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.e);
        e.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpe.start();
            }
        });
        f = (Button)this.findViewById(R.id.f);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.f);
        f.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpf.start();
            }
        });
        fsharp = (Button)this.findViewById(R.id.fsharp);
        final MediaPlayer mpfsharp = MediaPlayer.create(this, R.raw.fsharp);
        fsharp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpfsharp.start();
            }
        });
        g = (Button)this.findViewById(R.id.g);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.g);
        g.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpg.start();
            }
        });
        gsharp = (Button)this.findViewById(R.id.gsharp);
        final MediaPlayer mpgsharp = MediaPlayer.create(this, R.raw.gsharp);
        gsharp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpgsharp.start();
            }
        });
        a = (Button)this.findViewById(R.id.a);
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.a);
        a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpa.start();
            }
        });
        asharp = (Button)this.findViewById(R.id.asharp);
        final MediaPlayer mpasharp = MediaPlayer.create(this, R.raw.asharp);
        asharp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpasharp.start();
            }
        });
        b = (Button)this.findViewById(R.id.b);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.b);
        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpb.start();
            }
        });
        c = (Button)this.findViewById(R.id.c);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.c);
        c.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mpc.start();
            }
        });
    }
}

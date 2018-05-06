package com.thinkk.android.laflaute;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button s1=(Button)findViewById(R.id.button);
        final Button s2=(Button)findViewById(R.id.button2);
        final Button s3=(Button)findViewById(R.id.button3);
        final Button s4=(Button)findViewById(R.id.button4);
        final Button s5=(Button)findViewById(R.id.button5);
        final Button s6=(Button)findViewById(R.id.button6);
        final MediaPlayer m=MediaPlayer.create(MainActivity.this,R.raw.sa);
        final MediaPlayer m2=MediaPlayer.create(MainActivity.this,R.raw.ri);
        final MediaPlayer m3=MediaPlayer.create(MainActivity.this,R.raw.ga);
        final MediaPlayer m4=MediaPlayer.create(MainActivity.this,R.raw.ma);
        final MediaPlayer m5=MediaPlayer.create(MainActivity.this,R.raw.pa);
        final MediaPlayer m6=MediaPlayer.create(MainActivity.this,R.raw.dha);
        final MediaPlayer m7=MediaPlayer.create(MainActivity.this,R.raw.nee);
        /*s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        s3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                s4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        s5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                s6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        m.start();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });

                    }
                });


            }
        });*/
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            m.start();

            if(m2.isPlaying())
            {
                m3.stop();
            }
            if(m3.isPlaying())
            {
                m3.stop();
            }
            if(m4.isPlaying())
            {
                m4.stop();
            }
            if(m5.isPlaying())
            {
                m5.stop();
            }
            if(m6.isPlaying())
            {
                m6.stop();
            }
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();

                if(m.isPlaying())
                {
                    m.stop();
                }
                if(m3.isPlaying())
                {
                    m3.stop();
                }
                if(m4.isPlaying())
                {
                    m4.stop();
                }
                if(m5.isPlaying())
                {
                    m5.stop();
                }
                if(m6.isPlaying())
                {
                    m6.stop();
                }


            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();

                if(m.isPlaying())
                {
                    m.stop();
                }
                if(m2.isPlaying())
                {
                    m2.stop();
                }
                if(m4.isPlaying())
                {
                    m4.stop();
                }
                if(m5.isPlaying())
                {
                    m5.stop();
                }
                if(m6.isPlaying())
                {
                    m6.stop();
                }



            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();

                if(m.isPlaying())
                {
                    m.stop();
                }
                if(m2.isPlaying())
                {
                    m2.stop();
                }
                if(m3.isPlaying())
                {
                    m3.stop();
                }
                if(m5.isPlaying())
                {
                    m5.stop();
                }
                if(m6.isPlaying())
                {
                    m6.stop();
                }



            }
        });

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5.start();

                if(m.isPlaying())
                {
                    m.stop();
                }
                if(m2.isPlaying())
                {
                    m2.stop();
                }
                if(m3.isPlaying())
                {
                    m3.stop();
                }
                if(m4.isPlaying())
                {
                    m4.stop();
                }
                if(m6.isPlaying())
                {
                    m6.stop();
                }


            }
        });

        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6.start();

                if(m.isPlaying())
                {
                    m.stop();
                }
                if(m2.isPlaying())
                {
                    m2.stop();
                }
                if(m3.isPlaying())
                {
                    m3.stop();
                }
                if(m4.isPlaying())
                {
                    m4.stop();
                }
                if(m5.isPlaying())
                {
                    m5.stop();
                }

            }
        });
    }
}

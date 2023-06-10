package com.example.a10120243_uts_myself;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Music extends AppCompatActivity {
    //10 Juni 2023 - 10120243 - Mohammad Mausa Gani - IF-6
    Context contextVideo, context;
    RecyclerView recyclerViewVideo, recyclerViewMusic;
    RecyclerView.Adapter recyclerViewAdapterVideo, recyclerViewAdapterMusic;
    RecyclerView.LayoutManager recylerViewLayoutManagerVideo, recylerViewLayoutManagerMusic;
    VideoView videoView;
    String[] subjectValuesVideo = {
            "AWP ACE", "AWP ACE 2", "NEGEV ACE"
    };
    String[] subjectUrlVideo;
    String[] subjectValuesMusic = {
            "Photograph - Ed Sheeran",
            "Perfect - Ed Sheeran",
            "Shape of You - Ed Sheeran",
            "Sing - Ed Sheeran",
            "Thingkin out loud - Ed Sheeran",
            "Untitled - Simple Plan",
            "Perfect - Simple Plan",
            "Jet Lag - Simple Plan",
            "Welcome To my life - Simple Plan",
            "Yellow - Coldplay",
            "A Sky Full of Stars - Coldplay",
            "Beside You - Keshi",
            "Drunk - Keshi"
};
    DrawerLayout drawerLayout;
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        subjectUrlVideo=new String[]{
        "android.resource://"+getPackageName()+"/"+R.raw.video,
        "android.resource://"+getPackageName()+"/"+R.raw.video2,
        "android.resource://"+getPackageName()+"/"+R.raw.video3
        };
        contextVideo=getApplicationContext();
        recyclerViewVideo=findViewById(R.id.recyclerViewVideo);
        recylerViewLayoutManagerVideo=new LinearLayoutManager(this);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewVideo.setLayoutManager(recylerViewLayoutManagerVideo);
        recyclerViewAdapterVideo=new com.example.a10120243_uts_myself.AdapterRecycleViewVideo(subjectValuesVideo,subjectUrlVideo,this);
        recyclerViewVideo.setAdapter(recyclerViewAdapterVideo);

        context=getApplicationContext();
        recyclerViewMusic=findViewById(R.id.recyclerViewMusic);
        recylerViewLayoutManagerMusic=new LinearLayoutManager(context);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewMusic.setLayoutManager(recylerViewLayoutManagerMusic);
        recyclerViewAdapterMusic=new com.example.a10120243_uts_myself.AdapterRecycleViewMusic(subjectValuesMusic,context);
        recyclerViewMusic.setAdapter(recyclerViewAdapterMusic);

        //ass
        drawerLayout=findViewById(R.id.DrawerLayout);
        }
public void ClickMenu(View view){
        //Open drawer
    com.example.a10120243_uts_myself.HomeActivity.openDrawer(drawerLayout);

        }
public void ClickLogo(View view){
    com.example.a10120243_uts_myself.HomeActivity.closeDrawer(drawerLayout);
        }
public void ClickHome(View view){
        //redirect to home
    com.example.a10120243_uts_myself.HomeActivity.redirectActivity(this, com.example.a10120243_uts_myself.HomeActivity.class);
        }
public void ClickGallery(View view){
        //redirect to gallery
    com.example.a10120243_uts_myself.HomeActivity.redirectActivity(this, com.example.a10120243_uts_myself.Gallery.class);
        }

public void ClickDaily(View view){
        //redirect to gallery
    com.example.a10120243_uts_myself.HomeActivity.redirectActivity(this, com.example.a10120243_uts_myself.Daily.class);
        }
public void ClickMusic(View view){

        //recreate
        recreate();
        }
public void ClickProfile(View view){
        //redirect to profile
    com.example.a10120243_uts_myself.HomeActivity.redirectActivity(this, com.example.a10120243_uts_myself.Profile.class);
        }
public void ClickLogout(View view){
        //close
    com.example.a10120243_uts_myself.HomeActivity.logout(this);
        }

@Override
protected void onPause(){
        super.onPause();
        //close drawer
    com.example.a10120243_uts_myself.HomeActivity.closeDrawer(drawerLayout);
        }
        }
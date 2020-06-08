package com.borisruzanov.russianwives.mvp.ui.unlockuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.borisruzanov.russianwives.R;
import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import com.borisruzanov.russianwives.mvp.ui.main.MainScreenActivity;
import com.borisruzanov.russianwives.utils.UserHideCallback;

public class UnlockUserActivity extends AppCompatActivity implements UserHideCallback {

    private Button unlockButton;
    private TextView textView;
    private Prefs mPrefs;
    private UserRepository repository;
    private String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock_user);
        mPrefs=new Prefs(this);
        repository=new UserRepository(mPrefs);
        uid=getIntent().getStringExtra("uid");
        textView=findViewById(R.id.textView_unlock_activity);
        unlockButton=findViewById(R.id.button_unlock_activity);
        unlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repository.changeUserHideStatus(uid,false,UnlockUserActivity.this::hideStatusChangeCall);
            }
        });

    }


    @Override
    public void hideStatusChangeCall(boolean success) {
        if (success){
            Toast.makeText(getApplicationContext(),"Your account is unlocked",Toast.LENGTH_LONG).show();
            Intent main =new Intent(UnlockUserActivity.this, MainScreenActivity.class);
            main.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(main);
            finish();
        }else{
            Toast.makeText(getApplicationContext(),"Something went wrong!!,try again",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
package br.ufv.daniel.medcap.util;

import java.util.HashMap;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import br.ufv.daniel.medcap.view.activity.LoginActivity;

public class SessionManager {

    private SharedPreferences pref;
    private Editor editor;
    private Context cx;
    private static final String PREF_NAME = "MEDICAPPPREF";
    private static final String IS_LOGIN = "ISLOGGEDIN";
    public static final String KEY_NAME = "NAME";
    public static final String KEY_EMAIL = "EMAIL";

    public SessionManager(Context context){
        this.cx = context;
        pref = cx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }

    public void createLoginSession(String name, String email){
        editor.putBoolean(IS_LOGIN, true);
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_EMAIL, email);

        editor.commit();
    }

    public boolean checkLogin(){
        if(!this.isLoggedIn()){
            Intent i = new Intent(cx, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            cx.startActivity(i);
            return false;
        }
        return true;
    }

    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        // user name
        user.put(KEY_NAME, pref.getString(KEY_NAME, null));

        // user email id
        user.put(KEY_EMAIL, pref.getString(KEY_EMAIL, null));

        // return user
        return user;
    }

    public void logoutUser(){
        // Clearing all data from Shared Preferences
        editor.clear();
        editor.commit();

        // After logout redirect user to Loing Activity
        Intent i = new Intent(cx, LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Staring Login Activity
        cx.startActivity(i);
    }

    private boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }
}

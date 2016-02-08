package com.Fandom;
import android.app.Activity;
import android.os.Bundle;
import redis.clients.jedis.Jedis;

import android.view.View;
public class SignIn extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("sign in/up activity begun");

    }
    public void buttonOnClick(View v) {
        /*
        Will Created this code.. Tht is is the function fo what it should do
         */
        android.widget.Button button=(android.widget.Button) v;
        //Make Text Say Clicked
        ((android.widget.Button) v).setText("Signing in...");
        System.out.println("sign in/up button clicked");
       self. jedis.lpush("bla", "Redis");
        //System.out.println("Server is running: "+ jedis.ping());

    }
    public static void main(String[] args) {
        //Connecting to Redis on localhost
        Jedis jedis = new Jedis("localhost");
        //adding a new key
        jedis.set("key", "value");
        jedis.ping();
        //getting the key value
        System.out.println(jedis.get("key"));


    }


}






package com.example.sakshi.optionsmenu_programmatically_acad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    //creating options menu
    public boolean onCreateOptionsMenu(Menu menu) {
        //adding menus in the options menu
        //menu.add(groupId=none, itemId=1, orderId=order of the respective menus , charsequence= name of the respective menus)
        menu.add(Menu.NONE,1,1,"Option 1");
        menu.add(Menu.NONE,2,2,"Option 2");
        menu.add(Menu.NONE,3,3,"Option 3");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    //onitem select listener for the options menu
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();   //getting item's id into variable id
        //switching for the value of variable id
        switch(id){
            case 1:
            {   //case when the value of id is equal to 1
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case 2:
            {   //case when id is equal to 2
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case 3:
            {       //case when id is equal to 3
                Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show();
                break;
            }
        }


        return super.onOptionsItemSelected(item);
    }
}

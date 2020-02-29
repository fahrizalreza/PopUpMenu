package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button menuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    menuBtn = (Button) findViewById(R.id.menuBtn);

    menuBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, menuBtn);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    switch(menuItem.getItemId()){
                        case R.id.first:
                            Toast.makeText(MainActivity.this, "Data has been inserted", Toast.LENGTH_SHORT).show();
                            return  true;
                        case R.id.second:
                            Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                            return true;
                        case R.id.third:
                            Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
                            return true;
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
    });
    }
}

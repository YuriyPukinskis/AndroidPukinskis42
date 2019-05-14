package ru.netology.androidpukinskis42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_tasks) {
            Toast.makeText(MainActivity.this, "Отркыть Сроки Задачи", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, TasksActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_streets) {
            Toast.makeText(MainActivity.this, "Отркыть Страны Города Улицы", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, StreetsActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_check_box) {
            Toast.makeText(MainActivity.this, "Отркыть Checkbox", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, Check_boxActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_endless) {
            Toast.makeText(MainActivity.this, "Отркыть Бесконечный переход", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, EndlessActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_form) {
            Toast.makeText(MainActivity.this, "Отркыть Универсальную форму", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

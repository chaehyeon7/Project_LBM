package kr.hs.emirim.ohyoonseo.project_lbm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteActivity extends AppCompatActivity {
    EditText edit1;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writeletter);


        edit1 = findViewById(R.id.Edit1);
        send = findViewById(R.id.send);

        send.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    public class MyDBHelper extends SQLiteOpenHelper {

        public MyDBHelper(Context context) {
            super(context, "groupDB", null, 1);

        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE table groupTB (name char(20) primary key, count Integer);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists groubTB");
            onCreate(db);
        }
    }
}
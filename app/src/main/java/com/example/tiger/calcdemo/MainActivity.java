package com.example.tiger.calcdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pluslibrary.Math;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById(R.id.idEtNum1)
    EditText idEtNum1;
    @ViewById(R.id.idEtNum2)
    EditText idEtNum2;
    @ViewById(R.id.idTvResult)
    TextView idTvResult;


    @Click(R.id.idBtnAdd)
    void OnClickBtnAdd() {
        int iNum1 = Integer.parseInt(idEtNum1.getText().toString());
        int iNum2 = Integer.parseInt(idEtNum2.getText().toString());
        int iResult = Math.add(iNum1, iNum2);
        idTvResult.setText("" + iResult);
    }

}

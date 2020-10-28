package com.hijridate.app;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar;

import net.alhazmy13.hijridatepicker.date.hijri.HijriDatePickerDialog;

import java.util.Calendar;
import java.util.Locale;


public class CalenderFragment extends Fragment {

    TextView date;
    ImageView calender;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calender, container, false);
        date = view.findViewById(R.id.date_text);
        calender = view.findViewById(R.id.date_picker);
        openCalender();
        return view;
    }


    private void openCalender() {
        UmmalquraCalendar now = new UmmalquraCalendar();

        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HijriDatePickerDialog dpd = HijriDatePickerDialog.newInstance(
                        new HijriDatePickerDialog.OnDateSetListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onDateSet(HijriDatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        },
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)

                );
                //Change the language to any of supported language
                Locale locale = new Locale("ar");
                dpd.setLocale(locale);
                dpd.show(getFragmentManager(), "dialog");

            }
        });

    }



}
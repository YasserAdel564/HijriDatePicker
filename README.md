# HijriDatePicker
This library offers a hijri (Islamic Calendar) Date Picker designed on Google's Material Design Principals For Pickers for Android 5.0 (API 21) +



## Installation

> Gradle

```javascript

  allprojects {
  
    repositories { 
                maven {   url 'https://jitpack.io' } 
         }
    
  }
    
  dependencies {
      implementation 'com.github.YasserAdel564:HijriDatePicker:1.0.2'
  }
  ```
  
 >Implementation
 
 ```javascript

        UmmalquraCalendar now = new UmmalquraCalendar();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HijriDatePickerDialog dpd = HijriDatePickerDialog.newInstance(
                        new HijriDatePickerDialog.OnDateSetListener() {
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
       

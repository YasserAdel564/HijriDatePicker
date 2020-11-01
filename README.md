# HijriDatePicker
This library offers a hijri (Islamic Calendar) Date Picker designed on Google's Material Design Principals For Pickers for Android 5.0 (API 21) +



![ScreenShoot](https://github.com/YasserAdel564/HijriDatePicker/blob/master/app/Screenshot_20201101_154203.png)





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
  ```
  
  
  ## Coming Features
 * Make The UI More Attractive
 * Add More Validation in Date's Selection

 
 ## License
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the Licens


 ## Copyrights

 Forked From alhazmy (https://github.com/alhazmy13/HijriDatePicker) and Edited By ME 

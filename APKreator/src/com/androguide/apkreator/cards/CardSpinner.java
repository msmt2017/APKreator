/**
 * @author Louis Teboul (Androguide)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.androguide.apkreator.cards;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.androguide.apkreator.R;
import com.fima.cardsui.objects.Card;

import java.util.ArrayList;

public class CardSpinner extends Card {

    public CardSpinner(String title, String desc, ArrayList<String> spinnerEntries, ActionBarActivity fa, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super(title, desc, spinnerEntries, fa, onItemSelectedListener);
    }

    @Override
    public View getCardContent(Context context) {
        final View v = LayoutInflater.from(context).inflate(R.layout.card_spinner, null);

        ((TextView) v.findViewById(R.id.title)).setText(title);
        ((TextView) v.findViewById(R.id.desc)).setText(desc);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(fa, android.R.layout.simple_spinner_dropdown_item, spinnerEntries);
        ((Spinner) v.findViewById(R.id.spinner)).setOnItemSelectedListener(onItemSelectedListener);
        ((Spinner) v.findViewById(R.id.spinner)).setAdapter(adapter);

        return v;
    }

}
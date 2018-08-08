package com.abhilashkaranthm.countrynamecountrycode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private Button btnSubmit;
    EditText mobilenumber;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();


        textView = (TextView)findViewById( R.id.text );
        mobilenumber=(EditText) findViewById(R.id.input_number);
        Spinner s = (Spinner)findViewById(R.id.spinner1);
        final Countries countryaray[] = new Countries[]{
                new Countries("Afghanistan","+93"),
                new Countries("Albania","+355"),
                new Countries("Algeria","+213"),
                new Countries("American Samoa","+1(684)"),
                new Countries("Andorra","+376"),
                new Countries("Angola","+244"),
                new Countries("Anguilla","+1(264)"),
                new Countries("Antigua and Barbuda","+1(268)"),
                new Countries("Argentina","+54"),
                new Countries("Armenia","+374"),
                new Countries("Aruba","+297"),
                new Countries("Ascension","+247"),
                new Countries("Australia","+61"),
                new Countries("Australian Capital Territory","+672"),
                new Countries("Austria","+43"),
                new Countries("Azerbaijan","+994"),
                new Countries("Bahamas, The","+1(242)"),
                new Countries("Bahrain","+973"),
                new Countries("Bangladesh","+880"),
                new Countries("Barbados","+1(246)"),
                new Countries("Belarus","+375"),
                new Countries("Belgium","+32"),
                new Countries("Belize","+501"),
                new Countries("Benin","+229"),
                new Countries("Bermuda","+1(441)"),
                new Countries("Bhutan","+975"),
                new Countries("Bolivia","+591"),
                new Countries("Bosnia and Herzegovina","+387"),
                new Countries("Botswana","+267"),
                new Countries("Brazil","+55"),
                new Countries("British Virgin Islands","+1(284)"),
                new Countries("Brunei","+673"),
                new Countries("Bulgaria","+359"),
                new Countries("Burkina Faso","+226"),
                new Countries("Burma","+95"),
                new Countries("Burundi","+257"),
                new Countries("Cambodia","+855"),
                new Countries("Cameroon","+237"),
                new Countries("Canada","+1"),
                new Countries("Cape Verde","+238"),
                new Countries("Cayman Islands","+1(345)"),
                new Countries("Central African Republic","+236"),
                new Countries("Chad","+235"),
                new Countries("Chile","+56"),
                new Countries("China","+86"),
                new Countries("Colombia","+57"),
                new Countries("Comoros","+269"),
                new Countries("Congo, Democratic Republic of the","+243"),
                new Countries("Congo, Republic of the","+242"),
                new Countries("Cook Islands","+682"),
                new Countries("Costa Rica","+506"),
                new Countries("Côte d'Ivoire","+225"),
                new Countries("Croatia","+385"),
                new Countries("Cuba","+53"),
                new Countries("Cyprus","+357"),
                new Countries("Czech Republic","+420"),
                new Countries("Denmark","+45"),
                new Countries("Diego Garcia","+246"),
                new Countries("Djibouti","+253"),
                new Countries("Dominica","+1(767)"),
                new Countries("Dominican Republic","+1(809/829)"),
                new Countries("Ecuador","+593"),
                new Countries("Egypt","+20"),
                new Countries("El Salvador","+503"),
                new Countries("Equatorial Guinea","+240"),
                new Countries("Eritrea","+291"),
                new Countries("Estonia","+372"),
                new Countries("Ethiopia","+251"),
                new Countries("Falkland Islands (Islas Malvinas)","+500"),
                new Countries("Faroe Islands","+298"),
                new Countries("Fiji","+679"),
                new Countries("Finland","+358"),
                new Countries("France","+33"),
                new Countries("French Departments and Territories in the Indian Ocean","+262"),
                new Countries("French Guiana","+594"),
                new Countries("French Polynesia","+689"),
                new Countries("Gabon","+241"),
                new Countries("Gambia, The","+220"),
                new Countries("Georgia","+995"),
                new Countries("Germany","+49"),
                new Countries("Ghana","+233"),
                new Countries("Gibraltar","+350"),
                new Countries("Global Mobile SatelliteSystem (GMSS), sharedcode","+881"),
                new Countries("Greece","+30"),
                new Countries("Greenland","+299"),
                new Countries("Grenada","+1(473)"),
                new Countries("Group of countries, shared code","+388"),
                new Countries("Guadeloupe","+590"),
                new Countries("Guam","+1(671)"),
                new Countries("Guatemala","+502"),
                new Countries("Guinea","+224"),
                new Countries("Guinea-Bissau","+245"),
                new Countries("Guyana","+592"),
                new Countries("Haiti","+509"),
                new Countries("Holy See (Vatican City)","+379"),
                new Countries("Holy See (Vatican City)","+39"),
                new Countries("Honduras","+504"),
                new Countries("Hong Kong","+852"),
                new Countries("Hungary","+36"),
                new Countries("Iceland","+354"),
                new Countries("India","+91"),
                new Countries("Indonesia","+62"),
                new Countries("Inmarsat SNAC","+870"),
                new Countries("International Freephone Service","+800"),
                new Countries("International Networks, shared code","+882"),
                new Countries("International Networks, shared code","+883"),
                new Countries("International Premium Rate Service (IPRS)","+979"),
                new Countries("International Shared Cost Service (ISCS)","+808"),
                new Countries("Iran","+98"),
                new Countries("Iraq","+964"),
                new Countries("Ireland","+353"),
                new Countries("Israel","+972"),
                new Countries("Italy","+39"),
                new Countries("Jamaica","+1(876)"),
                new Countries("Japan","+81"),
                new Countries("Jordan","+962"),
                new Countries("Kazakhstan","+7"),
                new Countries("Kenya","+254"),
                new Countries("Kiribati","+686"),
                new Countries("Korea, North","+850"),
                new Countries("Korea, South","+82"),
                new Countries("Kuwait","+965"),
                new Countries("Kyrgyzstan","+996"),
                new Countries("Laos","+856"),
                new Countries("Latvia","+371"),
                new Countries("Lebanon","+961"),
                new Countries("Lesotho","+266"),
                new Countries("Liberia","+231"),
                new Countries("Libya","+218"),
                new Countries("Liechtenstein","+423"),
                new Countries("Lithuania","+370"),
                new Countries("Luxembourg","+352"),
                new Countries("Macau","+853"),
                new Countries("Macedonia [FYROM]","+389"),
                new Countries("Madagascar","+261"),
                new Countries("Malawi","+265"),
                new Countries("Malaysia","+60"),
                new Countries("Maldives","+960"),
                new Countries("Mali","+223"),
                new Countries("Malta","+356"),
                new Countries("Marshall Islands","+692"),
                new Countries("Martinique","+596"),
                new Countries("Mauritania","+222"),
                new Countries("Mauritius","+230"),
                new Countries("Mayotte","+269"),
                new Countries("Mexico","+52"),
                new Countries("Micronesia, Federated States of","+691"),
                new Countries("Moldova","+373"),
                new Countries("Monaco","+377"),
                new Countries("Mongolia","+976"),
                new Countries("Montenegro","+382"),
                new Countries("Montserrat","+1(664)"),
                new Countries("Morocco","+212"),
                new Countries("Mozambique","+258"),
                new Countries("Namibia","+264"),
                new Countries("Nauru","+674"),
                new Countries("Nepal","+977"),
                new Countries("Netherlands","+31"),
                new Countries("Netherlands Antilles","+599"),
                new Countries("New Caledonia","+687"),
                new Countries("New Zealand","+64"),
                new Countries("Nicaragua","+505"),
                new Countries("Niger","+227"),
                new Countries("Nigeria","+234"),
                new Countries("Niue","+683"),
                new Countries("Northern Territory","+1(670)"),
                new Countries("Norway","+47"),
                new Countries("Oman","+968"),
                new Countries("Pakistan","+92"),
                new Countries("Palau","+680"),
                new Countries("Panama","+507"),
                new Countries("Papua New Guinea","+675"),
                new Countries("Paraguay","+595"),
                new Countries("Peru","+51"),
                new Countries("Philippines","+63"),
                new Countries("Poland","+48"),
                new Countries("Portugal","+351"),
                new Countries("Puerto Rico","+1(787/939)"),
                new Countries("Qatar","+974"),
                new Countries("Reserved","+970"),
                new Countries("Romania","+40"),
                new Countries("Russia","+7"),
                new Countries("Rwanda","+250"),
                new Countries("Saint Helena","+290"),
                new Countries("Saint Kitts and Nevis","+1(869)"),
                new Countries("Saint Lucia","+1(758)"),
                new Countries("Saint Pierre and Miquelon","+508"),
                new Countries("Saint Vincent and the Grenadines","+1(784)"),
                new Countries("Samoa","+685"),
                new Countries("San Marino","+378"),
                new Countries("Sao Tome and Principe","+239"),
                new Countries("Saudi Arabia","+966"),
                new Countries("Senegal","+221"),
                new Countries("Serbia","+381"),
                new Countries("Seychelles","+248"),
                new Countries("Sierra Leone","+232"),
                new Countries("Singapore","+65"),
                new Countries("Slovakia","+421"),
                new Countries("Slovenia","+386"),
                new Countries("Solomon Islands","+677"),
                new Countries("Somalia","+252"),
                new Countries("South Africa","+27"),
                new Countries("Spain","+34"),
                new Countries("Sri Lanka","+94"),
                new Countries("Sudan","+249"),
                new Countries("Suriname","+597"),
                new Countries("Swaziland","+268"),
                new Countries("Sweden","+46"),
                new Countries("Switzerland","+41"),
                new Countries("Syria","+963"),
                new Countries("Taiwan","+886"),
                new Countries("Tajikistan","+992"),
                new Countries("Tanzania","+255"),
                new Countries("Telecommunications for Disaster Relief (TDR)","+888"),
                new Countries("Thailand","+66"),
                new Countries("Timor-Leste","+670"),
                new Countries("Togo","+228"),
                new Countries("Tokelau","+690"),
                new Countries("Tonga","+676"),
                new Countries("Trial of a proposed new international service, shared code","+991"),
                new Countries("Trinidad and Tobago","+1(868)"),
                new Countries("Tristan da Cunha","+290"),
                new Countries("Tunisia","+216"),
                new Countries("Turkey","+90"),
                new Countries("Turkmenistan","+993"),
                new Countries("Turks and Caicos Islands","+1(649)"),
                new Countries("Tuvalu","+688"),
                new Countries("Uganda","+256"),
                new Countries("Ukraine","+380"),
                new Countries("United Arab Emirates","+971"),
                new Countries("United Kingdom","+44"),
                new Countries("United States","+1"),
                new Countries("Universal Personal Telecommunication (UPT)","+878"),
                new Countries("Uruguay","+598"),
                new Countries("Uzbekistan","+998"),
                new Countries("Vanuatu","+678"),
                new Countries("Venezuela","+58"),
                new Countries("Vietnam","+84"),
                new Countries("Virgin Islands","+1(340)"),
                new Countries("Wallis and Futuna","+681"),
                new Countries("Yemen","+967"),
                new Countries("Zambia","+260"),
                new Countries("Zimbabwe","+263")
        };
        ArrayAdapter<Countries> adapter = new ArrayAdapter<Countries>(this, android.R.layout.simple_spinner_item, countryaray );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Countries d = (Countries) parent.getItemAtPosition(position);
                        textView.setText( d.getValue() );
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );


    }



    public void addListenerOnButton() {


        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                //startActivity(i);

            }

        });
    }
    public static boolean isValidPhone(String phone)
    {
        String expression = "^([0-9\\+]|\\(\\d{1,3}\\))[0-9\\-\\. ]{3,15}$";
        CharSequence inputString = phone;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.matches())
        {
            return true;
        }
        else{
            return false;
        }
    }

    class Countries {
        public Countries( String spinnerText, String value ) {
            this.spinnerText = spinnerText;
            this.value = value;
        }

        public String getSpinnerText() {
            return spinnerText;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return spinnerText;
        }

        String spinnerText;
        String value;
    }
}

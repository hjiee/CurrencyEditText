[![](https://jitpack.io/v/hjiee/CurrencyEditText.svg)](https://jitpack.io/#hjiee/CurrencyEditText)

# CurrencyEditText

![gif](https://user-images.githubusercontent.com/39892463/67396296-432dcd80-f5e2-11e9-92d6-bfcbc9ea0a14.gif)


## How to
To get a Git project into your build:  

### Step 1. Add the JitPack repository to your build file. 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}Copy
### Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.hjiee:CurrencyEditText:Tag'
	}


### Step 3. Add the preFix and postFix in Xml files

    <com.currency.currencyedittext.CurrencyEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:preFix="KRW"
        app:postFix="KRW"/>
        
## preFix & postFix
| Currency | Symbole | Digital Code | Name | Country |
| :--------: | :--------: | :----------: | :---------: | :---------: | 
| Default | Left | Center | Right |:---------: | 
|AED|	د.إ	|784	|UAE Dirham	|UAE|  
|AFN|	Af|	971	|Afghani	Afghanistan|
|ALL|	L|	8	|Lek|	Albania|
|AMD|	Դ|	51	|Armenian Dram|	Armenia|
|AOA|	Kz|	973	|Kwanza	|Angola
|ARS|	$	|32|	Argentine Peso	|Argentina|
|AUD|	$	|36|	Australian Dollar|	Australia <br> Kiribati <br> Coconut Islands <br> Nauru <br> Tuvalu|
|AWG|	ƒ	|533	Aruban Guilder/Florin	Aruba|
|AZN|	ман|	944|	Azerbaijanian Manat|	Azerbaijan|
|BAM|	КМ|	977|	Konvertibilna Marka	|Bosnia and Herzegovina|
|BBD|	$|	52|	Barbados Dollar|	Barbados|
|BDT|	৳|	50|	Taka|	Bangladesh|
|BGN|	лв|	975|	Bulgarian Lev	|Bulgaria|
|BHD|	ب.د	|48	|Bahraini Dinar|Bahrain|
|BIF|	₣|	108|	Burundi Franc|	Burundi|
|BMD|	$|	60|	Bermudian Dollar|	Bermuda|
|BND|	$	|96|	Brunei Dollar|	Brunei <br> Singapore|
|BOB|	Bs.|	68	|Boliviano	|Bolivia|
|BRL|	R$	|986|	Brazilian Real|	Brazil|
|BSD|	$|	44|	Bahamian Dollar	Bahamas|
|BTN|		|64	|Ngultrum|	Bhutan|
|BWP|	P	|72	|Pula	|Botswana|
|BYN|	Br|	933|	Belarusian Ruble	|Belarus|
|BZD|	$	|84|	Belize Dollar	|Belize|
|CAD|	$	|124	|Canadian Dollar|	Canada|
|CDF|	₣	|976	|Congolese Franc	|Congo (Kinshasa)|
|CHF|	₣	|756	|Swiss Franc	|Lichtenstein <br> Switzerland|
|CLP|	$	|152	|Chilean Peso|	Chile|
|CNY|	¥	|156	|Yuan|	China|
|COP|	$	|170	|Colombian Peso|	Colombia|
|CRC|	₡	|188	|Costa Rican Colon|	Costa Rica|
|CUP|	$	|192	|Cuban Peso|	Cuba|
|CVE|	$	|132	|Cape Verde Escudo|	Cape Verde|
|CZK|	Kč|	203	|Czech Koruna	|Czech Republic|
|DJF|	₣	|262	Djibouti Franc	Djibouti|
|DKK|	kr|	208	Danish Krone	Denmark|
|DOP|	$	|214	Dominican Peso	Dominican Republic|
|DZD|	د.ج	12	Algerian Dinar	Algeria|
|EGP|	£	|818	Egyptian Pound	Egypt|
|ERN|	Nfk|	232	Nakfa	Eritrea|
|ETB|		|230	Ethiopian Birr	Ethiopia|
|EUR|	€|	978	Euro	Akrotiri and Dhekelia <br> Andorra <br> Austria <br> Belgium <br> Cyprus <br> Estonia <br> Finland <br> France <br> Germany <br> Greece <br> Ireland <br> Italy <br> Kosovo <br> Latvia <br> Lithuania <br> Luxembourg <br> Malta <br> Monaco <br> Montenegro <br> Netherlands <br> Portugal <br> San-Marino <br> Slovakia <br> Slovenia <br> Spain <br> Vatican|
|FJD|	$|	242	Fiji Dollar	Fiji|
|FKP|	£|	238	Falkland Islands Pound	Falkland Islands|
|GBP|	£|	826	Pound Sterling	Alderney <br> British Indian Ocean Territory <br> Great Britain <br> Isle of Maine|
|GEL|	ლ|	981	Lari	Georgia <br> South Ossetia|
|GHS|	₵|	936	Cedi	Ghana|
|GIP|	£|	292	Gibraltar Pound	Gibraltar|
|GMD|	D|	270	Dalasi	Gambia|
|GNF|	₣|	324	Guinea Franc	Guinea|
|GTQ|	Q|	320	Quetzal	Guatemala|
|GYD|	$|	328	Guyana Dollar	Guyana|
|HKD|	$|	344	Hong Kong Dollar	Hong Kong|
|HNL|	L|	340	Lempira	Honduras|
|HRK|	Kn|	191	Croatian Kuna	Croatia|
|HTG|	G	|332	Gourde	Haiti|
|HUF|	Ft|	348	Forint	Hungary|
|IDR|	Rp|	360	Rupiah	Indonesia|
|ILS|	₪	|376	New Israeli Shekel	Israel <br> Palestine|
|INR|	₹	|356	Indian Rupee	Bhutan <br> India|
|IQD|	ع.د	368	Iraqi Dinar|	Iraq|
|IRR|	﷼	364	Iranian Rial	Iran|
|ISK|	Kr|	352	Iceland Krona	Iceland|
|JMD|	$	|388	Jamaican Dollar	Jamaica|
|JOD|	د.ا	400	Jordanian Dinar	Jordan|
|JPY|	¥	|392	Yen	Japan|
|KES|	Sh|	404	Kenyan Shilling	Kenya|
|KGS|		|417	Som	Kyrgyzstan|
|KHR|	៛	|116	Riel	Cambodia|
|KPW|	₩|	408	North Korean Won	North Korea|
|KRW|	₩	|410	South Korean Won	South Korea|
|KWD|	د.ك	414	Kuwaiti Dinar	Kuwait|
|KYD|	$|	136	Cayman Islands Dollar	Cayman Islands|
|KZT|	〒|	398	Tenge	Kazakhstan|
|LAK|	₭|	418	Kip	Laos|
|LBP|	ل.ل	422	Lebanese Pound	Lebanon|
|LKR|	Rs|	144	Sri Lanka Rupee	Sri Lanka|
|LRD|	$	|430	Liberian Dollar	Liberia|
|LSL|	L	|426	Loti	Lesotho|
|LYD|	ل.د	434	Libyan Dinar	Libya|
|MAD|	د.م.	504	Moroccan Dirham	Morocco|
|MDL|	L	498	Moldovan Leu	Moldova|
|MGA|		969	Malagasy Ariary	Madagascar|
|MKD|	ден	807	Denar	Macedonia|
|MMK|	K	104	Kyat	Myanmar (Burma)|
|MNT|	₮	496	Tugrik	Mongolia|
|MOP|	P	446	Pataca	Macao|
|MRU|	UM	929	Ouguiya	Mauritania|
|MUR|	₨	480	Mauritius Rupee	Mauritius|
|MVR|	ރ.	462	Rufiyaa	Maldives|
|MWK|	MK	454	Kwacha	Malawi|
|MXN|	$	484	Mexican Peso	Mexico|
|MYR|	RM	458	Malaysian Ringgit	Malaysia|
|MZN|	MTn	943	Metical	Mozambique|
|NAD|	$	516	Namibia Dollar	Namibia|
|NGN|	₦	566	Naira	Nigeria|
|NIO|	C$	558	Cordoba Oro	Nicaragua|
|NOK|	kr	578	Norwegian Krone	Norway|
|NPR|	₨	524	Nepalese Rupee	Nepal|
|NZD|	$	554	New Zealand Dollar	Cook Islands <br> New Zealand <br> Niue <br> Pitcairn Island|
|OMR|	ر.ع.	512	Rial Omani	Oman|
|PAB|	B/.	590	Balboa	Panama|
|PEN|	S/.	604	Nuevo Sol	Peru|
|PGK|	K	598	Kina	Papua New Guinea|
|PHP|	₱	608	Philippine Peso	Philippines|
|PKR|	₨	586	Pakistan Rupee	Pakistan|
|PLN|	zł	985	PZloty	Poland|
|PYG|	₲	600	Guarani	Paraguay|
|QAR|	ر.ق	634	Qatari Rial	Qatar|
|RON|	L	946	Leu	Romania|
|RSD|	din	941	Serbian Dinar	Kosovo <br> Serbia|
|RUB|	р. 	643	Russian Ruble	Russia <br> South Ossetia|
|RWF|	₣	646	Rwanda Franc	Rwanda|
|SAR|	ر.س	682	Saudi Riyal	Saudi Arabia|
|SBD|	$	90	Solomon Islands Dollar	Solomon Islands|
|SCR|	₨	690	Seychelles Rupee	Seychelles|
|SDG|	£	938	Sudanese Pound	Sudan|
|SEK|	kr	752	Swedish Krona	Sweden|
|SGD|	$	702	Singapore Dollar	Brunei <br> Singapore|
|SHP|	£	654	Saint Helena Pound	Ascension Island <br> Saint Helena <br> Tristan da Cunha|
|SLL|	Le	694	Leone	Sierra Leone|
|SOS|	Sh	706	Somali Shilling	Somalia|
|SRD|	$	968	Suriname Dollar	Suriname|
|STN|	Db	930	Dobra	Sao Tome and Principe|
|SYP|	ل.س	760	Syrian Pound	Syria|
|SZL|	L	748	Lilangeni	Swaziland|
|THB|	฿	764	Baht	Thailand|
|TJS|	ЅМ	972	Somoni	Tajikistan|
|TMT|	m	934	Manat	Turkmenistan|
|TND|	د.ت	788	Tunisian Dinar	Tunisia|
|TOP|	T$	776	Pa’anga	Tonga|
|TRY|	₤	949	Turkish Lira	North Cyprus <br> Turkey|
|TTD|	$	780	Trinidad and Tobago Dollar	Trinidad and Tobago|
|TWD|	$	901	Taiwan Dollar	Taiwan|
|TZS|	Sh	834	Tanzanian Shilling	Tanzania|
|UAH|	₴	980	Hryvnia	Ukraine|
|UGX|	Sh	800	Uganda Shilling	Uganda|
|USD|	$	840	US Dollar	American Samoa <br> British Indian Ocean Territory <br> British Virgin Islands <br> Guam <br> Haiti <br> Marshall Islands <br> Micronesia <br> Northern Mariana Islands <br> Pacific Remote islands <br> Palau <br> Panama <br> Puerto Rico <br> Turks and Caicos Islands <br> United States of America <br> US Virgin Islands
|UYU|	$	858	Peso Uruguayo	Uruguay|
|UZS|		860	Uzbekistan Sum	Uzbekistan|
|VEF|	Bs F	937	Bolivar Fuerte	Venezuela|
|VND|	₫	704	Dong	Vietnam|
|VUV|	Vt	548	Vatu	Vanuatu|
|WST|	T	882	Tala	Samoa|
|XAF|	₣	950	CFA Franc BCEAO	Benin <br> Burkina Faso <br> Cameroon <br> Central African Republic <br> Chad <br> Congo (Brazzaville) <br> Côte d'Ivoire <br> Equatorial Guinea <br> Gabon <br> Guinea-Bissau <br> Mali <br> Niger <br> Senegal <br> Togo
|XCD|	$	951	East Caribbean Dollar	Anguilla <br> Antigua and Barbuda <br> Dominica <br> Grenada <br> Montserrat <br> Saint Kitts and Nevis <br> Saint Lucia <br> Saint Vincent and Grenadine|
|XPF|	₣	953	CFP Franc	French Polynesia <br> New Caledonia <br> Wallis and Futuna|
|YER|	﷼	886	Yemeni Rial	Yemen|
|ZAR|	R	710	Rand	Lesotho <br> Namibia <br> South Africa|
|ZMW|	ZK|	967	|Zambian Kwacha|	Zambia|
|ZWL|	$|	932|	Zimbabwe Dollar|	Zimbabwe|



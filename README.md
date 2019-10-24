[![](https://jitpack.io/v/hjiee/CurrencyEditText.svg)](https://jitpack.io/#hjiee/CurrencyEditText)
![](https://img.shields.io/badge/API-15+-blue)

# CurrencyEditText

![gif](https://user-images.githubusercontent.com/39892463/67396296-432dcd80-f5e2-11e9-92d6-bfcbc9ea0a14.gif)


## :pushpin:How to
To get a Git project into your build:  

### Step 1. Add the JitPack repository to your build file. 

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

### Step 2. Add the dependency
```gradle
dependencies {
	implementation 'com.github.hjiee:CurrencyEditText:1.0.1'
}
```

### Step 3. Add the preFix and postFix in Xml files
```gradle
<com.currency.currencyedittext.CurrencyEditText
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	app:preFix="KRW"
	app:postFix="KRW"/>
```

## :pushpin:preFix & postFix
search => https://justforex.com/ko/education/currencies   

![세계 통화 기호 이름 기호 및 코드](https://user-images.githubusercontent.com/39892463/67403352-c05e4000-f5ec-11e9-953d-4483a12196c6.png)


# Add project specific ProGuard rules here.
-keep class com.demo.app.** { *; }
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

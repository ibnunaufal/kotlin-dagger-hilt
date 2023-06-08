

1. Import Hilt library
2. Create BaseApplication, annotate @HiltAndroidApp when declaring that class
3. Call BaseApplication in Manifest in 'android:name' attribute
4. On activity/fragment that will be injected, use @AndroidEntryPoint annotation in class declaration
5. Create injection module, in this project named as AppModule, use @Module annotation
6. 
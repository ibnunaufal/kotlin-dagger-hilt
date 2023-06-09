

1. Import Hilt library
2. Create BaseApplication, annotate @HiltAndroidApp when declaring that class
3. Call BaseApplication in Manifest in 'android:name' attribute
4. On activity/fragment that will be injected, use @AndroidEntryPoint annotation in class declaration
5. Create injection module, in this project named as AppModule, use @Module annotation
6. Add @InstallIn annotation in AppModule, used to declare which scope this module will be used
   > @InstallIn(SingletonComponent)  = used as long as the app was opened 
   
   > @InstallIn(ActivityComponent) = used only when activity opened or actived
7. Create class and its function that will be injected, Named as Engine class & startEngine function
8. Normally, without injection without hilt will looks like that, see note #1 on MainActivity

9. With hilt, we need to create a provider inside the AppModule to provide the function or variable that will be injected
10. Add @Singleton annotation to the provide function, used to create the injection only once, not when we needed(memory leak)
11. Add @Provides annotation to declare that its function was a function that will be injected
12. In MainActivity, we'll try to call the injection, declare a lateinit variable first, see note #2
13. Dont forget to add @Inject annotation, used to declare that its function was a place to get the injection
14. Try to use the variable that was injected, see note #3
15. Try to inject a string variable, check note #4 in AppModule and MainActivity
16. To prevent duplication, if you provide a same data type, in this case we have 2 provide that return string, we can use @Named annotation, see note #5
17. Also use @Named annotation when we called the injection
18. 
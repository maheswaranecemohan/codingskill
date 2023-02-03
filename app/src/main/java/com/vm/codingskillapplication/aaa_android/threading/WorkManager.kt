package com.vm.codingskillapplication.aaa_android.threading

//Background processing in modern Android
//https://stackoverflow.com/questions/72415454/background-processing-in-modern-android
/*
1. Downloading large file (500mb)

    a. Once a day on exact time

    b Once a day when the OS can, in any time

2. Downloading small file (5k)

    a. Once a day on exact time

    b Once a day when the OS can, in any time

3. Setting alarm at exact time

4. Sync DB with server (large data about 5min runtime)

    a. Every 15 min (Minimal time?)

    b. Once a Day

5. Sync DB with server (small data less than 1sec runtime)

    a. Every 5 min

    b. Every 15 min

    c. Once a Day*/
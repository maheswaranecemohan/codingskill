package com.vm.codingskillapplication.zzznewui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vm.codingskillapplication.R
import com.vm.codingskillapplication.zzznewui.ui.main.MainFragment
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
package com.zebdul.btnavbybackpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import com.zebdul.btnavbybackpaper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHomeFragment = supportFragmentManager.findFragmentById(R.id.fragView)
        val navController = navHomeFragment!!.findNavController()

        val popUpMenu = PopupMenu(this, null)
        popUpMenu.inflate(R.menu.menu)
        binding.bottomBar.setupWithNavController(popUpMenu.menu, navController)
        /*
        1. main folder -> 3 blank fragment
        2. add viewBinding in gradle and main.kt
        3. add images to drawable 3 images
        4. make navigation component -> res -> new resource directory (type:navigation)
        5. navigationDirectory -> new res file
        6. click add on + icon add all three fragments
        7. res -> android resource file -> file name : type menu
           A. add 3 items on this with id's,
           B. add icon on all
        8. main.xml -> add bottom navigation view code
            A. add dependencies in gradle app or gradle setting according to ibrahimsn98
            A. add app:menu=@manu/nav_menu
        9. add a fragment on main.xml set to all constraint and height 0dp
            A. android:name="androidx.navigation.fragment.NavHostFragment"
            B. app:defaultNavHost = "true"
            C. app:navGraph = @navigation/app.xml
        10. initialize private late init variable for binding
            A. add navController:NavController
        11. find navigation with id
            A. navController = Navigation.findNavController(this, R.id.fragment)
                setUpWithNavController(binding.bottomNav, navController)
         */


    }
}
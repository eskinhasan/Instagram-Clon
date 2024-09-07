package com.example.InstagramUI.view.view.home




import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.InstagramUI.R
import com.example.InstagramUI.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var navHostFragment:NavHostFragment?=null
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)




       navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
       val nav= NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment!!.navController)











       // setFragment(HomeFragment())



    }






    @SuppressLint("CommitTransaction")
    private fun setFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentContainerView.id,fragment)
        fragmentTransaction.commit()

    }




}
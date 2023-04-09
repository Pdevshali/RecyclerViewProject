package com.example.recyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecycleView: RecyclerView
    lateinit var newsArrayList : ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecycleView = findViewById(R.id.recycleView)

        val newsImageArray = arrayOf(
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5
        )

        val newsHeadingArray = arrayOf(
            "From Byjus to Netflix: Cyberabad Police busts India's 'biggest' data theft",
            "Assam: Storm, heavy rainfall cause massive damage in Jonai; trees uprooted, roads blocked",
            "Italy seeks to ban English, other foreign languages in official communication",
            "Navi Mumbai Metro Line 1 To Become Reality In April: Stations, Fare, Route Map",
            "High activity spotted at North Korea nuclear site after Kim orders production of more weapons"
        )
        // to set the items behaviour inside recyclerview : ie. vertically scrolling, horizontally, uniform grid
        myRecycleView.layoutManager = LinearLayoutManager(this)

        newsArrayList = arrayListOf<News>()

        for(index in newsImageArray.indices){
            val news = News(newsHeadingArray[index], newsImageArray[index])
            newsArrayList.add(news)
        }

        myRecycleView.adapter = myAdapter(newsArrayList, this)




    }
}
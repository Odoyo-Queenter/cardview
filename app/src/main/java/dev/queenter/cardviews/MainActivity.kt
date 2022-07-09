package dev.queenter.cardviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.queenter.cardviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }

    fun displayTweets(){
        var tweet = Tweet ("Queenter","@Odoyo","She's the Queen from the south","10m","1.2m","6b")
        var tweet1 = Tweet ("Kimberly","@Faith","She's the Queen from the south","10m","1.2m","6b")
        var tweet2 = Tweet ("Athanasius","@Owuor","She's the Queen from the south","10m","1.2m","6b")
        var tweet3 = Tweet ("Anjelina","@Atieno","She's the Queen from the south","10m","1.2m","6b")
        var tweet4= Tweet ("Valentino","@Odiwuor","She's the Queen from the south","10m","1.2m","6b")
        var tweet5 = Tweet ("Bruno","@Evance","She's the Queen from the south","10m","1.2m","6b")
        var tweet6 = Tweet ("Juliet","@Nakayiza","She's the Queen from the south","10m","1.2m","6b")
        var tweet7 = Tweet ("Effence","@Kamau","She's the Queen from the south","10m","1.2m","6b")
        var tweet8 = Tweet ("Akuot","@Philips","She's the Queen from the south","10m","1.2m","6b")


        var tweetlist = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet6,tweet7,tweet8)
        var tweetsAdapter = TweetrvAdapter (tweetlist)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetsAdapter


    }
}
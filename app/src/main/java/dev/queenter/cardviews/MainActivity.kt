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
        var tweet = Tweet ("Queenter","@Odoyo","She's the Queen from the south,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. ","10m","1.2m","6b")
        var tweet1 = Tweet ("Kimberly","@Faith","Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).","10m","1.2m","6b")
        var tweet2 = Tweet ("Athanasius","@Owuor"," It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software","10m","1.2m","6b")
        var tweet3 = Tweet ("Anjelina","@Atieno","There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.","10m","1.2m","6b")
        var tweet4= Tweet ("Valentino","@Odiwuor","On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. ","10m","1.2m","6b")
        var tweet5 = Tweet ("Bruno","@Evance","These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted.","10m","1.2m","6b")
        var tweet6 = Tweet ("Juliet","@Nakayiza"," Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it?","10m","1.2m","6b")
        var tweet7 = Tweet ("Effence","@Kamau","However, it's unknown who made these modifications to the text, or exactly when, to turn it into the mess of words we know today. Sometime in the 1500s, an unknown printer scrambled words that have survived into the digital age.","10m","1.2m","6b")
        var tweet8 = Tweet ("Akuot","@Philips","This way, graphic designers, full stack developers…etc. can focus on other core elements, such as creating graphical elements and creating the page layout. Right before the webpage is set to launch","10m","1.2m","6b")


        var tweetlist = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet6,tweet7,tweet8)
        var tweetsAdapter = TweetrvAdapter (tweetlist)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetsAdapter


    }
}
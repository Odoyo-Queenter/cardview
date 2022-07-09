package dev.queenter.cardviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class TweetrvAdapter (var tweetlist:List<Tweet>):
        RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweetss_item,parent,false)
        return TweetViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currenttweet = tweetlist.get(position)
        holder.tvDisplayName.text = currenttweet.displayname
        holder.tvHandler.text= currenttweet.handle
        holder.tvMessages.text = currenttweet.tweet

    }

    override fun getItemCount(): Int {
        return tweetlist.size
    }
}
class TweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvDisplayName = itemView.findViewById<TextView>(R.id.tvDisplayName)
    var tvHandler = itemView.findViewById<TextView>(R.id.tvHandler)
    var tvMessages= itemView.findViewById<TextView>(R.id.tvMessages)
    var imgPerson = itemView.findViewById<ImageView>(R.id.imgPerson)
    var imgMessage = itemView.findViewById<ImageView>(R.id.imgMessage)
    var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgLike = itemView.findViewById<ImageView>(R.id.imgLike)
    var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)
}
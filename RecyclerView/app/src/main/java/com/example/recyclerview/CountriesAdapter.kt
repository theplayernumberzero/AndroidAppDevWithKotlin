package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,//For showing Toast message
    var context: Context
) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var textViewCountryName : TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetails : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageView : CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {  //Define card design
        //Parent is main activity
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design, parent, false)

        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {  //Amount of data which is gonna be display
        return countryNameList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {   //Show data in recycler view at there
        holder.textViewCountryName.text = countryNameList.get(position)
        holder.textViewDetails.text = detailsList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

        holder.cardView.setOnClickListener {
            Toast.makeText(context, "You selected the ${countryNameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}
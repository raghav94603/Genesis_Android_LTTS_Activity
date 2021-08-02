package com.android.raghav.login_signup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var userList :ArrayList<UserData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        fun holdingView(userData: UserData){

            var myName: TextView= itemView.findViewById<TextView>(R.id.name)
            var myEmail : TextView= itemView.findViewById<TextView>(R.id.email)
            

            myName.setText(userData.name)
            myEmail.setText(userData.email)
            

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var v:View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return  MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.holdingView(userList[position])

    }


}
package com.vokasi.mahasiswa_rifqi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val userList: ArrayList<User>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user: User=userList[position]
        holder?.id?.text = user.id
        holder?.judul?.text = user.judul
        holder?.waktu?.text = user.waktu
        holder?.penulis?.text = user.penulis
        holder?.isi?.text = user.isi

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return  ViewHolder(v)

    }


    override fun getItemCount(): Int {

        return userList.size
    }



    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val id = itemView.findViewById(R.id.id_berita) as TextView
        val judul = itemView.findViewById(R.id.judul_berita) as TextView
        val waktu = itemView.findViewById(R.id.waktu_berita) as TextView
        val penulis = itemView.findViewById(R.id.penulis_berita) as TextView
        val isi = itemView.findViewById(R.id.isi_berita) as TextView




    }


}
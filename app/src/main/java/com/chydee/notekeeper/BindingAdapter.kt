package com.chydee.notekeeper

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.chydee.notekeeper.data.model.Note
import com.chydee.notekeeper.home.NoteAdapter

class BindingAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Note>?) {
    val adapter = recyclerView.adapter as NoteAdapter
    adapter.submitList(data

    )
}
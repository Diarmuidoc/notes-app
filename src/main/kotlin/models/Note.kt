package models

class Note {
    data class Note(
        val noteTitle: String,
        val notePriority: Int,
        val noteCategory: String,
        val isNoteArchived: Boolean){
    }
}

//Test
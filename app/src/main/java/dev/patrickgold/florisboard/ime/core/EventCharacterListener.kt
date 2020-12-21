package dev.patrickgold.florisboard.ime.core

interface EventCharacterListener {

    fun onValue(character:String)
    fun onDeleteBackwards()

}
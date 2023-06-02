package com.example.nakheiapp

interface Destinations{
    val Route : String
}

object Home: Destinations{
    override val Route = "home"
}

object SecondPage: Destinations{
    override val Route = "SecondPage"
}
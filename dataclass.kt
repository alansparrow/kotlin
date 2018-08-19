fun main(args : Array<String>) {
    data class Podcast(val title: String, val desc: String, val url: String)

    val podcast = Podcast("Android Central", "Desc 1", "url")

    val podcast2 = podcast.copy(title = "Developer Backstage")

    val (title, desc, url) = podcast2

    println("$title $desc $url")

    println(podcast2.hashCode())
    println(podcast2.toString())

    val podcast3 = podcast.copy()

    println(podcast == podcast3)
}
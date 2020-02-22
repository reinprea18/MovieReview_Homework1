package at.fh.swengb.reinprecht

object MovieRepository {
    private val movies: List<Movie>

    init {
        val person1 = Person("Jennifer Lee", "01.07.1999")
        val person2 = Person("Todd Phillips", "01.07.1999")
        val person3 = Person("Bora Dagtekin", "01.07.1999")
        val person4 = Person("Conrad Vernon", "01.07.1999")
        val person5 = Person("Jon Favreau", "01.07.1999")
        val person6 = Person("Jon Watts", "01.07.1999")
        val person7 = Person("Gary Dauberman", "01.07.1999")
        val person8 = Person("Danny Boyle", "01.07.1999")
        val person9 = Person("Chris Renaud","01.07.1999")
        val person10 = Person("Simon Kinberg","01.07.1999")
        val person11 = Person("Andres Muschietti","01.07.1999")
        val person12 = Person("Michael Engler","01.07.1999")
        val person13 = Person("Adrian Grünberg","01.07.1999")
        val person14 = Person("Vanessa Jopp","01.07.1999")
        val person15 = Person("Thurop van Orman","01.07.1999")




        movies = listOf(
            Movie("0",
                "Die Eiskönigin 2",
                "2019",
                "Fortsetzung des Oscar-prämierten Animationsfilms von Disney über die märchenhafte Eiskönigin Elsa, die lernen muss, ihre magischen Kräfte zu kontrollieren.",
                MovieGenre.Action,
                person1,
                listOf( person2, person3 ),
                mutableListOf()
            ),
            Movie("1",
                "Joker",
                "2019",
                "In der düsteren Originstory von Batmans Erzrivalen, dem Joker, spielt Joaquin Phoenix einen Mann, der zu Unrecht von der Gesellschaft ausgestoßen wird.",
                MovieGenre.Drama,
                person2,
                listOf( person3, person4, person5),
                mutableListOf()
            ) ,
            Movie("2",
                "Das perfekte Geheimnis",
                "2019",
                "Es sollte ein entspanntes Abendessen unter Freunden werden. Im Laufe des Gesprächs kommen die drei Frauen und vier Männer auf das Thema Ehrlichkeit und beschließen spaßeshalber ihre Telefonate und eingehende Nachrichten offen zu legen. Eingehende Anrufe müssen fortan auf Lautsprecher gestellt und Nachrichten laut vorgelesen werden.",
                MovieGenre.Comedy,
                person3,
                listOf( person4, person5, person6 ),
                mutableListOf()

            ) ,
            Movie("3",
                "Addams Family",
                "2019",
                "Die Familie Addams ist neu in der Nachbarschaft und zieht in eine leicht heruntergekommenen viktorianischen Villa. Die Nachbarn beäugen die neue Familie argwöhnisch und begegnen ihnen mitunter verängstigt.",
                MovieGenre.Comedy,
                person4,
                listOf( person5, person6, person7 ),
                mutableListOf()

            ) ,
            Movie("4",
                "Der König der Löwen",
                "2019",
                "Alle Tiere der Savanne sind gekommen, um der Geburt des junge Löwe Simba, Sohn des Königs der Löwen Mufasa und dessen Löwin Sarabi beizuwohnen. Stolz hält Mufasa den Thronfolger in die Luft.",
                MovieGenre.Action,
                person5,
                listOf( person6, person7, person8 ),
                mutableListOf()
            ) ,
            Movie("5",
                "Spider Man: Far From Home",
                "2019",
                "Peter Parker geht auf Klassenfahrt – doch auch auf der Reise sind die Superkräfte von Spider-Man gefragt, als Mysterio sein Debüt auf der Kinoleinwand gibt.",
                MovieGenre.Action,
                person6,
                listOf( person7, person8, person9 ),
                mutableListOf()
            ) ,
            Movie("6",
                "Annabelle 3",
                "2019",
                "Um die Puppe Annabelle von weiteren Gräueltaten abzuhalten hat sie das Dämonologen-Ehepaar Warren in ihre Obhut genommen. Sie befindet sich sicher verwahrt hinter geheiligtem und von einem Priester geweihtem Glas.",
                MovieGenre.Horror,
                person7,
                listOf( person8, person9, person10),
                mutableListOf()
            ) ,
            Movie("7",
                "Yesterday",
                "2019",
                "Mit „All You Need Is Love“ haben John Lennon und Paul McCartney einen der größten Hits für die Beatles geschaffen. Doch was wäre, wenn sich niemand mehr daran erinnern würde?",
                MovieGenre.Romance,
                person8,
                listOf(person9, person10, person11 ),
                mutableListOf()
            ) ,
            Movie("8",
                "Pets 2",
                "2019",
                "Was treiben unsere Haustiere eigentlich, wenn wir nicht zu Hause sind? Der turbulente Animationsfilm „Pets“ hat diese Frage im Jahr 2016 beantwortet.",
                MovieGenre.Comedy,
                person9,
                listOf( person10, person11, person12),
                mutableListOf()
            ) ,
            Movie("9",
                "X-Men: Dark Phoenix",
                "2019",
                "Die mächtige Telepathin wird von einer ungeheuerlichen Macht beherrscht, der Phoenix-Kraft. Nur mit Mühe und Not kann sie die Kontrolle behalten.",
                MovieGenre.Drama,
                person10,
                listOf( person11, person12, person13),
                mutableListOf()
            ) ,
            Movie("10",
                "Es Kapitel 2",
                "2019",
                "Der Club der Verlierer hatte geglaubt, den Horrorclown Pennywise besiegt zu haben. Doch das Grauen hat sich bloß in die Kanalisation von Derry zurückgezogen, um seine Wunden zu lecken.",
                MovieGenre.Horror,
                person11,
                listOf( person12, person13, person14 ),
                mutableListOf()
            ) ,
            Movie("11",
                "Downton Abbey",
                "2019",
                "Die Familie Crawley rund um Stammhalter Robert Crawley und Ehefrau Cora Crawley ist nach langer Abwesenheit endlich zurück! Im Jahr 1927 bahnt sich königlicher Besuch an, den sogar Violet Crawley in die Knie zwingen wird.",
                MovieGenre.Drama,
                person12,
                listOf( person13, person14 ),
                mutableListOf()
            ) ,
            Movie("12",
                "Rambo: Last Blood",
                "2019",
                "Eigentlich will John Rambo nichts weiter, als sich endlich zur Ruhe setzen. Er erfährt, dass die Tochter seiner Haushälterin Maria, die bereits lange für Rambos Vater gearbeitet hat, entführt wurde.",
                MovieGenre.Action,
                person13,
                listOf( person14, person15, person13 ),
                mutableListOf()
            ) ,
            Movie("13",
                "Gut gegen Nordwind",
                "2019",
                "E-Mail für E-Mail kommen sich Leo und Emmi immer näher. Zuerst zaghaft, dann intensiver berichten sie auch von ihrem Privatleben.",
                MovieGenre.Romance,
                person14,
                listOf( person15, person3, person2 ),
                mutableListOf()
            ) ,
            Movie("14",
                "Angry Birds 2",
                "2019",
                "Vögel und Schweine stehen immer noch auf Kriegsfuß, doch von der fernen Adler-Insel nähert sich bereits eine neue Bedrohung!",
                MovieGenre.Action,
                person15,
                listOf( person1, person4, person9 ),
                mutableListOf()

            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}
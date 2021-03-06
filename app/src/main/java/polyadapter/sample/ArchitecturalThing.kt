package polyadapter.sample

import io.reactivex.Observable
import polyadapter.sample.data.CategoryTitle
import polyadapter.sample.data.DividerLine
import polyadapter.sample.data.Movie
import javax.inject.Inject

/**
 * place holder for VM/Presenter/etc...
 */
class ArchitecturalThing @Inject constructor() {
  fun dataSource(): Observable<List<Any>> {
    return Observable.just(listOf(
        CategoryTitle("The Hobbit"),
        Movie("An Unexpected Journey",
            "https://www.imdb.com/title/tt0903624/",
            "https://m.media-amazon.com/images/M/MV5BMTcwNTE4MTUxMl5BMl5BanBnXkFtZTcwMDIyODM4OA@@._V1_SY1000_CR0,0,674,1000_AL_.jpg"),
        DividerLine(),
        Movie("The Desolation of Smaug",
            "https://www.imdb.com/title/tt1170358/",
            "https://m.media-amazon.com/images/M/MV5BMzU0NDY0NDEzNV5BMl5BanBnXkFtZTgwOTIxNDU1MDE@._V1_SY1000_CR0,0,675,1000_AL_.jpg"),
        DividerLine(),
        Movie("The Battle of the Five Armies",
            "https://www.imdb.com/title/tt2310332/",
            "https://m.media-amazon.com/images/M/MV5BODAzMDgxMDc1MF5BMl5BanBnXkFtZTgwMTI0OTAzMjE@._V1_SY1000_SX675_AL_.jpg"),
        CategoryTitle("Lord of the Rings"),
        Movie("The Fellowship of the Ring",
            "https://www.imdb.com/title/tt0120737/",
            "https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SY999_CR0,0,673,999_AL_.jpg"),
        DividerLine(),
        Movie("The Two Towers",
            "https://www.imdb.com/title/tt0167261/",
            "https://m.media-amazon.com/images/M/MV5BMDY0NmI4ZjctN2VhZS00YzExLTkyZGItMTJhOTU5NTg4MDU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg"),
        DividerLine(),
        Movie("The Return of the King",
            "https://www.imdb.com/title/tt0167260/",
            "https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,675,1000_AL_.jpg"),
        DividerLine()
    ))
  }
}
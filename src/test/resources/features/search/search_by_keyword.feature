#language:es
@PruebaSerenity
Característica: Search by keyword
  Escenario: Searching for a term
    Dado Sergey is on the DuckDuckGo home page
    Cuando he searches for "cucumber"
    Entonces all the result titles should contain the word "cucumber"
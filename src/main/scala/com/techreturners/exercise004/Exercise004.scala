package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, LocalTime}


class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  val GigaSecond  = 1000000000

  def this(localDate: LocalDate) = {
    this(LocalDateTime.of(localDate, LocalTime.MIDNIGHT))
  }

  def getDateTimeWithGigaSecond: LocalDateTime = dateTime.plusSeconds(GigaSecond)
}

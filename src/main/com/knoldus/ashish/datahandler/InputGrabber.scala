package main.com.knoldus.ashish.datahandler

/**
  * Created by ashish on 1/27/17.
  */
trait InputGrabber {
  def inputLocation : String
  def getText(): String
}

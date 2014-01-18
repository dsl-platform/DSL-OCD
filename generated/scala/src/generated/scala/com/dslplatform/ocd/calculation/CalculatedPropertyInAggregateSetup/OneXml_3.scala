package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneXml_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneXml: scala.xml.Elem,
    private var _calculatedOneXml: scala.xml.Elem,
    private var _persistedOneXml: scala.xml.Elem
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneXml_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneXml_3("+ URI +")"

   def copy(oneXml: scala.xml.Elem = this._oneXml): OneXml_3 = {

  require(oneXml ne null, "Null value was provided for property \"oneXml\"")
    new OneXml_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneXml = oneXml, _calculatedOneXml = _calculatedOneXml, _persistedOneXml = _persistedOneXml)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneXml_3): this.type = {
    this._URI = result._URI
    this._oneXml = result._oneXml
    this._calculatedOneXml = result._calculatedOneXml
    this._persistedOneXml = result._persistedOneXml
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneXml_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneXml")
  def oneXml = {
    _oneXml
  }

  def oneXml_= (value: scala.xml.Elem) {
    _oneXml = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneXml")
  def calculatedOneXml = {
    _calculatedOneXml
  }

  def calculatedOneXml_= (value: scala.xml.Elem) {
    _calculatedOneXml = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneXml")
  def persistedOneXml = {
    _persistedOneXml
  }

  def persistedOneXml_= (value: scala.xml.Elem) {
    _persistedOneXml = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneXml") oneXml: scala.xml.Elem
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneXml") calculatedOneXml: scala.xml.Elem
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneXml") persistedOneXml: scala.xml.Elem
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneXml = if (oneXml == null) ??? else oneXml, _calculatedOneXml = if (calculatedOneXml == null) ??? else calculatedOneXml, _persistedOneXml = if (persistedOneXml == null) ??? else persistedOneXml)

}

object OneXml_3 extends AggregateRootCompanion[OneXml_3]{

  def apply(
    oneXml: scala.xml.Elem = ???
  ) = {
    require(oneXml ne null, "Null value was provided for property \"oneXml\"")
    new OneXml_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneXml = oneXml
    , _calculatedOneXml = ???
    , _persistedOneXml = ???)
  }

}

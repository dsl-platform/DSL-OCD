package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneString_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneString: String,
    private var _calculatedOneString: String,
    private var _persistedOneString: String
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneString_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneString_4("+ URI +")"

   def copy(oneString: String = this._oneString): OneString_4 = {

  require(oneString ne null, "Null value was provided for property \"oneString\"")
    new OneString_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneString = oneString, _calculatedOneString = _calculatedOneString, _persistedOneString = _persistedOneString)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneString_4): this.type = {
    this._URI = result._URI
    this._oneString = result._oneString
    this._calculatedOneString = result._calculatedOneString
    this._persistedOneString = result._persistedOneString
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneString_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneString")
  def oneString = {
    _oneString
  }

  def oneString_= (value: String) {
    _oneString = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneString")
  def calculatedOneString = {
    _calculatedOneString
  }

  def calculatedOneString_= (value: String) {
    _calculatedOneString = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneString")
  def persistedOneString = {
    _persistedOneString
  }

  def persistedOneString_= (value: String) {
    _persistedOneString = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneString") oneString: String
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneString") calculatedOneString: String
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneString") persistedOneString: String
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneString = if (oneString == null) "" else oneString, _calculatedOneString = if (calculatedOneString == null) "" else calculatedOneString, _persistedOneString = if (persistedOneString == null) "" else persistedOneString)

}

object OneString_4 extends AggregateRootCompanion[OneString_4]{

  def apply(
    oneString: String = ""
  ) = {
    require(oneString ne null, "Null value was provided for property \"oneString\"")
    new OneString_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneString = oneString
    , _calculatedOneString = ""
    , _persistedOneString = "")
  }

}

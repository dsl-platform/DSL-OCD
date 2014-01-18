package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneLongs_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneLongs: Array[Long],
    private var _calculatedOneArrayOfOneLongs: Array[Long],
    private var _persistedOneArrayOfOneLongs: Array[Long]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneLongs_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneLongs_4("+ URI +")"

   def copy(oneArrayOfOneLongs: Array[Long] = this._oneArrayOfOneLongs): OneArrayOfOneLongs_4 = {

  require(oneArrayOfOneLongs ne null, "Null value was provided for property \"oneArrayOfOneLongs\"")
    new OneArrayOfOneLongs_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneLongs = oneArrayOfOneLongs, _calculatedOneArrayOfOneLongs = _calculatedOneArrayOfOneLongs, _persistedOneArrayOfOneLongs = _persistedOneArrayOfOneLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneLongs_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneLongs = result._oneArrayOfOneLongs
    this._calculatedOneArrayOfOneLongs = result._calculatedOneArrayOfOneLongs
    this._persistedOneArrayOfOneLongs = result._persistedOneArrayOfOneLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneLongs_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneLongs = {
    _oneArrayOfOneLongs
  }

  def oneArrayOfOneLongs_= (value: Array[Long]) {
    _oneArrayOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneLongs")
  def calculatedOneArrayOfOneLongs = {
    _calculatedOneArrayOfOneLongs
  }

  def calculatedOneArrayOfOneLongs_= (value: Array[Long]) {
    _calculatedOneArrayOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneLongs")
  def persistedOneArrayOfOneLongs = {
    _persistedOneArrayOfOneLongs
  }

  def persistedOneArrayOfOneLongs_= (value: Array[Long]) {
    _persistedOneArrayOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneLongs") oneArrayOfOneLongs: Array[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneLongs") calculatedOneArrayOfOneLongs: Array[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneLongs") persistedOneArrayOfOneLongs: Array[Long]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneLongs = if (oneArrayOfOneLongs == null) Array.empty else oneArrayOfOneLongs, _calculatedOneArrayOfOneLongs = calculatedOneArrayOfOneLongs, _persistedOneArrayOfOneLongs = persistedOneArrayOfOneLongs)

}

object OneArrayOfOneLongs_4 extends AggregateRootCompanion[OneArrayOfOneLongs_4]{

  def apply(
    oneArrayOfOneLongs: Array[Long] = Array.empty
  ) = {
    require(oneArrayOfOneLongs ne null, "Null value was provided for property \"oneArrayOfOneLongs\"")
    new OneArrayOfOneLongs_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneLongs = oneArrayOfOneLongs
    , _calculatedOneArrayOfOneLongs = Array.empty
    , _persistedOneArrayOfOneLongs = Array.empty)
  }

}

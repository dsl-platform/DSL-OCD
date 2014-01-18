package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableBinaries: Array[Option[Array[Byte]]],
    private var _calculatedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]],
    private var _persistedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableBinaries_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableBinaries_4("+ URI +")"

   def copy(oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = this._oneArrayOfNullableBinaries): OneArrayOfNullableBinaries_4 = {

  require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)
    new OneArrayOfNullableBinaries_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableBinaries = oneArrayOfNullableBinaries, _calculatedOneArrayOfNullableBinaries = _calculatedOneArrayOfNullableBinaries, _persistedOneArrayOfNullableBinaries = _persistedOneArrayOfNullableBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBinaries_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableBinaries = result._oneArrayOfNullableBinaries
    this._calculatedOneArrayOfNullableBinaries = result._calculatedOneArrayOfNullableBinaries
    this._persistedOneArrayOfNullableBinaries = result._persistedOneArrayOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBinaries_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableBinaries = {
    _oneArrayOfNullableBinaries
  }

  def oneArrayOfNullableBinaries_= (value: Array[Option[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBinaries")
  def calculatedOneArrayOfNullableBinaries = {
    _calculatedOneArrayOfNullableBinaries
  }

  def calculatedOneArrayOfNullableBinaries_= (value: Array[Option[Array[Byte]]]) {
    _calculatedOneArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBinaries")
  def persistedOneArrayOfNullableBinaries = {
    _persistedOneArrayOfNullableBinaries
  }

  def persistedOneArrayOfNullableBinaries_= (value: Array[Option[Array[Byte]]]) {
    _persistedOneArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries") oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBinaries") calculatedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBinaries") persistedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableBinaries = if (oneArrayOfNullableBinaries == null) Array.empty else oneArrayOfNullableBinaries, _calculatedOneArrayOfNullableBinaries = calculatedOneArrayOfNullableBinaries, _persistedOneArrayOfNullableBinaries = persistedOneArrayOfNullableBinaries)

}

object OneArrayOfNullableBinaries_4 extends AggregateRootCompanion[OneArrayOfNullableBinaries_4]{

  def apply(
    oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)
    require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
    new OneArrayOfNullableBinaries_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableBinaries = oneArrayOfNullableBinaries
    , _calculatedOneArrayOfNullableBinaries = Array.empty
    , _persistedOneArrayOfNullableBinaries = Array.empty)
  }

}

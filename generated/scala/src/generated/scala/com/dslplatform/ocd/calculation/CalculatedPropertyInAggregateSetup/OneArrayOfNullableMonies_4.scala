package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableMonies: Array[Option[BigDecimal]],
    private var _calculatedOneArrayOfNullableMonies: Array[Option[BigDecimal]],
    private var _persistedOneArrayOfNullableMonies: Array[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableMonies_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableMonies_4("+ URI +")"

   def copy(oneArrayOfNullableMonies: Array[Option[BigDecimal]] = this._oneArrayOfNullableMonies): OneArrayOfNullableMonies_4 = {

  require(oneArrayOfNullableMonies ne null, "Null value was provided for property \"oneArrayOfNullableMonies\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMonies)
    new OneArrayOfNullableMonies_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableMonies = oneArrayOfNullableMonies, _calculatedOneArrayOfNullableMonies = _calculatedOneArrayOfNullableMonies, _persistedOneArrayOfNullableMonies = _persistedOneArrayOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableMonies_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableMonies = result._oneArrayOfNullableMonies
    this._calculatedOneArrayOfNullableMonies = result._calculatedOneArrayOfNullableMonies
    this._persistedOneArrayOfNullableMonies = result._persistedOneArrayOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableMonies_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableMonies = {
    _oneArrayOfNullableMonies
  }

  def oneArrayOfNullableMonies_= (value: Array[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableMonies = value

    _oneArrayOfNullableMonies = com.dslplatform.api.Guards.setArrayOptionScale(_oneArrayOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableMonies")
  def calculatedOneArrayOfNullableMonies = {
    _calculatedOneArrayOfNullableMonies
  }

  def calculatedOneArrayOfNullableMonies_= (value: Array[Option[BigDecimal]]) {
    _calculatedOneArrayOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableMonies")
  def persistedOneArrayOfNullableMonies = {
    _persistedOneArrayOfNullableMonies
  }

  def persistedOneArrayOfNullableMonies_= (value: Array[Option[BigDecimal]]) {
    _persistedOneArrayOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMonies") oneArrayOfNullableMonies: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableMonies") calculatedOneArrayOfNullableMonies: Array[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableMonies") persistedOneArrayOfNullableMonies: Array[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableMonies = if (oneArrayOfNullableMonies == null) Array.empty else oneArrayOfNullableMonies, _calculatedOneArrayOfNullableMonies = calculatedOneArrayOfNullableMonies, _persistedOneArrayOfNullableMonies = persistedOneArrayOfNullableMonies)

}

object OneArrayOfNullableMonies_4 extends AggregateRootCompanion[OneArrayOfNullableMonies_4]{

  def apply(
    oneArrayOfNullableMonies: Array[Option[BigDecimal]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMonies)
    require(oneArrayOfNullableMonies ne null, "Null value was provided for property \"oneArrayOfNullableMonies\"")
    new OneArrayOfNullableMonies_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableMonies = oneArrayOfNullableMonies
    , _calculatedOneArrayOfNullableMonies = Array.empty
    , _persistedOneArrayOfNullableMonies = Array.empty)
  }

}

package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableDecimals: Set[Option[BigDecimal]],
    private var _calculatedOneSetOfNullableDecimals: Set[Option[BigDecimal]],
    private var _persistedOneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDecimals_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDecimals_4("+ URI +")"

   def copy(oneSetOfNullableDecimals: Set[Option[BigDecimal]] = this._oneSetOfNullableDecimals): OneSetOfNullableDecimals_4 = {

  require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)
    new OneSetOfNullableDecimals_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableDecimals = oneSetOfNullableDecimals, _calculatedOneSetOfNullableDecimals = _calculatedOneSetOfNullableDecimals, _persistedOneSetOfNullableDecimals = _persistedOneSetOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDecimals_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDecimals = result._oneSetOfNullableDecimals
    this._calculatedOneSetOfNullableDecimals = result._calculatedOneSetOfNullableDecimals
    this._persistedOneSetOfNullableDecimals = result._persistedOneSetOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDecimals_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDecimals = {
    _oneSetOfNullableDecimals
  }

  def oneSetOfNullableDecimals_= (value: Set[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDecimals")
  def calculatedOneSetOfNullableDecimals = {
    _calculatedOneSetOfNullableDecimals
  }

  def calculatedOneSetOfNullableDecimals_= (value: Set[Option[BigDecimal]]) {
    _calculatedOneSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDecimals")
  def persistedOneSetOfNullableDecimals = {
    _persistedOneSetOfNullableDecimals
  }

  def persistedOneSetOfNullableDecimals_= (value: Set[Option[BigDecimal]]) {
    _persistedOneSetOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDecimals") oneSetOfNullableDecimals: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDecimals") calculatedOneSetOfNullableDecimals: Set[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDecimals") persistedOneSetOfNullableDecimals: Set[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableDecimals = if (oneSetOfNullableDecimals == null) Set.empty else oneSetOfNullableDecimals, _calculatedOneSetOfNullableDecimals = calculatedOneSetOfNullableDecimals, _persistedOneSetOfNullableDecimals = persistedOneSetOfNullableDecimals)

}

object OneSetOfNullableDecimals_4 extends AggregateRootCompanion[OneSetOfNullableDecimals_4]{

  def apply(
    oneSetOfNullableDecimals: Set[Option[BigDecimal]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDecimals)
    require(oneSetOfNullableDecimals ne null, "Null value was provided for property \"oneSetOfNullableDecimals\"")
    new OneSetOfNullableDecimals_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableDecimals = oneSetOfNullableDecimals
    , _calculatedOneSetOfNullableDecimals = Set.empty
    , _persistedOneSetOfNullableDecimals = Set.empty)
  }

}

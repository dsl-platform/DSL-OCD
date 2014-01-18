package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]],
    private var _calculatedOneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]],
    private var _persistedOneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableDecimals_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableDecimals_4("+ URI +")"

   def copy(oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]] = this._oneListOfNullableDecimals): OneListOfNullableDecimals_4 = {

  require(oneListOfNullableDecimals ne null, "Null value was provided for property \"oneListOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimals)
    new OneListOfNullableDecimals_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableDecimals = oneListOfNullableDecimals, _calculatedOneListOfNullableDecimals = _calculatedOneListOfNullableDecimals, _persistedOneListOfNullableDecimals = _persistedOneListOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableDecimals_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableDecimals = result._oneListOfNullableDecimals
    this._calculatedOneListOfNullableDecimals = result._calculatedOneListOfNullableDecimals
    this._persistedOneListOfNullableDecimals = result._persistedOneListOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableDecimals_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableDecimals = {
    _oneListOfNullableDecimals
  }

  def oneListOfNullableDecimals_= (value: IndexedSeq[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableDecimals")
  def calculatedOneListOfNullableDecimals = {
    _calculatedOneListOfNullableDecimals
  }

  def calculatedOneListOfNullableDecimals_= (value: IndexedSeq[Option[BigDecimal]]) {
    _calculatedOneListOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableDecimals")
  def persistedOneListOfNullableDecimals = {
    _persistedOneListOfNullableDecimals
  }

  def persistedOneListOfNullableDecimals_= (value: IndexedSeq[Option[BigDecimal]]) {
    _persistedOneListOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimals") oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableDecimals") calculatedOneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableDecimals") persistedOneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableDecimals = if (oneListOfNullableDecimals == null) IndexedSeq.empty else oneListOfNullableDecimals, _calculatedOneListOfNullableDecimals = calculatedOneListOfNullableDecimals, _persistedOneListOfNullableDecimals = persistedOneListOfNullableDecimals)

}

object OneListOfNullableDecimals_4 extends AggregateRootCompanion[OneListOfNullableDecimals_4]{

  def apply(
    oneListOfNullableDecimals: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimals)
    require(oneListOfNullableDecimals ne null, "Null value was provided for property \"oneListOfNullableDecimals\"")
    new OneListOfNullableDecimals_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableDecimals = oneListOfNullableDecimals
    , _calculatedOneListOfNullableDecimals = IndexedSeq.empty
    , _persistedOneListOfNullableDecimals = IndexedSeq.empty)
  }

}

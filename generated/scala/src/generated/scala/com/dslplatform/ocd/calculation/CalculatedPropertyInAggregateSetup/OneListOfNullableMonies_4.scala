package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableMonies_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]],
    private var _calculatedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]],
    private var _persistedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableMonies_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableMonies_4("+ URI +")"

   def copy(oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = this._oneListOfNullableMonies): OneListOfNullableMonies_4 = {

  require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)
    new OneListOfNullableMonies_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableMonies = oneListOfNullableMonies, _calculatedOneListOfNullableMonies = _calculatedOneListOfNullableMonies, _persistedOneListOfNullableMonies = _persistedOneListOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableMonies_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableMonies = result._oneListOfNullableMonies
    this._calculatedOneListOfNullableMonies = result._calculatedOneListOfNullableMonies
    this._persistedOneListOfNullableMonies = result._persistedOneListOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableMonies_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableMonies = {
    _oneListOfNullableMonies
  }

  def oneListOfNullableMonies_= (value: IndexedSeq[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableMonies = value

    _oneListOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_oneListOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMonies")
  def calculatedOneListOfNullableMonies = {
    _calculatedOneListOfNullableMonies
  }

  def calculatedOneListOfNullableMonies_= (value: IndexedSeq[Option[BigDecimal]]) {
    _calculatedOneListOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMonies")
  def persistedOneListOfNullableMonies = {
    _persistedOneListOfNullableMonies
  }

  def persistedOneListOfNullableMonies_= (value: IndexedSeq[Option[BigDecimal]]) {
    _persistedOneListOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies") oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableMonies") calculatedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableMonies") persistedOneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableMonies = if (oneListOfNullableMonies == null) IndexedSeq.empty else oneListOfNullableMonies, _calculatedOneListOfNullableMonies = calculatedOneListOfNullableMonies, _persistedOneListOfNullableMonies = persistedOneListOfNullableMonies)

}

object OneListOfNullableMonies_4 extends AggregateRootCompanion[OneListOfNullableMonies_4]{

  def apply(
    oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)
    require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
    new OneListOfNullableMonies_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableMonies = oneListOfNullableMonies
    , _calculatedOneListOfNullableMonies = IndexedSeq.empty
    , _persistedOneListOfNullableMonies = IndexedSeq.empty)
  }

}

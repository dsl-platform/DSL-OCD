package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]],
    private var _calculatedNullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]],
    private var _persistedNullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableMonies_3("+ URI +")"

   def copy(nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]] = this._nullableListOfNullableMonies): NullableListOfNullableMonies_3 = {

  require(nullableListOfNullableMonies ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
  if(nullableListOfNullableMonies.isDefined) require(nullableListOfNullableMonies.get ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableMonies)
    new NullableListOfNullableMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableMonies = nullableListOfNullableMonies, _calculatedNullableListOfNullableMonies = _calculatedNullableListOfNullableMonies, _persistedNullableListOfNullableMonies = _persistedNullableListOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableMonies_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableMonies = result._nullableListOfNullableMonies
    this._calculatedNullableListOfNullableMonies = result._calculatedNullableListOfNullableMonies
    this._persistedNullableListOfNullableMonies = result._persistedNullableListOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableMonies")
  def nullableListOfNullableMonies = {
    _nullableListOfNullableMonies
  }

  def nullableListOfNullableMonies_= (value: Option[IndexedSeq[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableMonies = value

    _nullableListOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_nullableListOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableMonies")
  def calculatedNullableListOfNullableMonies = {
    _calculatedNullableListOfNullableMonies
  }

  def calculatedNullableListOfNullableMonies_= (value: Option[IndexedSeq[Option[BigDecimal]]]) {
    _calculatedNullableListOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableMonies")
  def persistedNullableListOfNullableMonies = {
    _persistedNullableListOfNullableMonies
  }

  def persistedNullableListOfNullableMonies_= (value: Option[IndexedSeq[Option[BigDecimal]]]) {
    _persistedNullableListOfNullableMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableMonies") nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableMonies") calculatedNullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableMonies") persistedNullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableMonies = nullableListOfNullableMonies, _calculatedNullableListOfNullableMonies = calculatedNullableListOfNullableMonies, _persistedNullableListOfNullableMonies = persistedNullableListOfNullableMonies)

}

object NullableListOfNullableMonies_3 extends AggregateRootCompanion[NullableListOfNullableMonies_3]{

  def apply(
    nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableMonies)
    require(nullableListOfNullableMonies ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
    if (nullableListOfNullableMonies.isDefined) require(nullableListOfNullableMonies.get ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
    new NullableListOfNullableMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableMonies = nullableListOfNullableMonies
    , _calculatedNullableListOfNullableMonies = None
    , _persistedNullableListOfNullableMonies = None)
  }

}

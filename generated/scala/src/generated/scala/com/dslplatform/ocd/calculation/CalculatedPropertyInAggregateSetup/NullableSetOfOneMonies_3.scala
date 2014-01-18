package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneMonies: Option[Set[BigDecimal]],
    private var _calculatedNullableSetOfOneMonies: Option[Set[BigDecimal]],
    private var _persistedNullableSetOfOneMonies: Option[Set[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneMonies_3("+ URI +")"

   def copy(nullableSetOfOneMonies: Option[Set[BigDecimal]] = this._nullableSetOfOneMonies): NullableSetOfOneMonies_3 = {

  require(nullableSetOfOneMonies ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
  if(nullableSetOfOneMonies.isDefined) require(nullableSetOfOneMonies.get ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMonies)
    new NullableSetOfOneMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneMonies = nullableSetOfOneMonies, _calculatedNullableSetOfOneMonies = _calculatedNullableSetOfOneMonies, _persistedNullableSetOfOneMonies = _persistedNullableSetOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneMonies_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneMonies = result._nullableSetOfOneMonies
    this._calculatedNullableSetOfOneMonies = result._calculatedNullableSetOfOneMonies
    this._persistedNullableSetOfOneMonies = result._persistedNullableSetOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMonies")
  def nullableSetOfOneMonies = {
    _nullableSetOfOneMonies
  }

  def nullableSetOfOneMonies_= (value: Option[Set[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneMonies = value

    _nullableSetOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_nullableSetOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneMonies")
  def calculatedNullableSetOfOneMonies = {
    _calculatedNullableSetOfOneMonies
  }

  def calculatedNullableSetOfOneMonies_= (value: Option[Set[BigDecimal]]) {
    _calculatedNullableSetOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneMonies")
  def persistedNullableSetOfOneMonies = {
    _persistedNullableSetOfOneMonies
  }

  def persistedNullableSetOfOneMonies_= (value: Option[Set[BigDecimal]]) {
    _persistedNullableSetOfOneMonies = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMonies") nullableSetOfOneMonies: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneMonies") calculatedNullableSetOfOneMonies: Option[Set[BigDecimal]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneMonies") persistedNullableSetOfOneMonies: Option[Set[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneMonies = nullableSetOfOneMonies, _calculatedNullableSetOfOneMonies = calculatedNullableSetOfOneMonies, _persistedNullableSetOfOneMonies = persistedNullableSetOfOneMonies)

}

object NullableSetOfOneMonies_3 extends AggregateRootCompanion[NullableSetOfOneMonies_3]{

  def apply(
    nullableSetOfOneMonies: Option[Set[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMonies)
    require(nullableSetOfOneMonies ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
    if (nullableSetOfOneMonies.isDefined) require(nullableSetOfOneMonies.get ne null, "Null value was provided for property \"nullableSetOfOneMonies\"")
    new NullableSetOfOneMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneMonies = nullableSetOfOneMonies
    , _calculatedNullableSetOfOneMonies = None
    , _persistedNullableSetOfOneMonies = None)
  }

}

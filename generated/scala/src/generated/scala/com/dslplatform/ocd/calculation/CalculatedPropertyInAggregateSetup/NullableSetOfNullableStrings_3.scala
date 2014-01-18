package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableStrings: Option[Set[Option[String]]],
    private var _calculatedNullableSetOfNullableStrings: Option[Set[Option[String]]],
    private var _persistedNullableSetOfNullableStrings: Option[Set[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableStrings_3("+ URI +")"

   def copy(nullableSetOfNullableStrings: Option[Set[Option[String]]] = this._nullableSetOfNullableStrings): NullableSetOfNullableStrings_3 = {

  require(nullableSetOfNullableStrings ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
  if(nullableSetOfNullableStrings.isDefined) require(nullableSetOfNullableStrings.get ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableStrings)
    new NullableSetOfNullableStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableStrings = nullableSetOfNullableStrings, _calculatedNullableSetOfNullableStrings = _calculatedNullableSetOfNullableStrings, _persistedNullableSetOfNullableStrings = _persistedNullableSetOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableStrings_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableStrings = result._nullableSetOfNullableStrings
    this._calculatedNullableSetOfNullableStrings = result._calculatedNullableSetOfNullableStrings
    this._persistedNullableSetOfNullableStrings = result._persistedNullableSetOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStrings")
  def nullableSetOfNullableStrings = {
    _nullableSetOfNullableStrings
  }

  def nullableSetOfNullableStrings_= (value: Option[Set[Option[String]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableStrings")
  def calculatedNullableSetOfNullableStrings = {
    _calculatedNullableSetOfNullableStrings
  }

  def calculatedNullableSetOfNullableStrings_= (value: Option[Set[Option[String]]]) {
    _calculatedNullableSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableStrings")
  def persistedNullableSetOfNullableStrings = {
    _persistedNullableSetOfNullableStrings
  }

  def persistedNullableSetOfNullableStrings_= (value: Option[Set[Option[String]]]) {
    _persistedNullableSetOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStrings") nullableSetOfNullableStrings: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableStrings") calculatedNullableSetOfNullableStrings: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableStrings") persistedNullableSetOfNullableStrings: Option[Set[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableStrings = nullableSetOfNullableStrings, _calculatedNullableSetOfNullableStrings = calculatedNullableSetOfNullableStrings, _persistedNullableSetOfNullableStrings = persistedNullableSetOfNullableStrings)

}

object NullableSetOfNullableStrings_3 extends AggregateRootCompanion[NullableSetOfNullableStrings_3]{

  def apply(
    nullableSetOfNullableStrings: Option[Set[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableStrings)
    require(nullableSetOfNullableStrings ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    if (nullableSetOfNullableStrings.isDefined) require(nullableSetOfNullableStrings.get ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    new NullableSetOfNullableStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableStrings = nullableSetOfNullableStrings
    , _calculatedNullableSetOfNullableStrings = None
    , _persistedNullableSetOfNullableStrings = None)
  }

}

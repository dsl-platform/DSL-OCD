package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]],
    private var _calculatedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]],
    private var _persistedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableStrings_3("+ URI +")"

   def copy(nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = this._nullableListOfNullableStrings): NullableListOfNullableStrings_3 = {

  require(nullableListOfNullableStrings ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
  if(nullableListOfNullableStrings.isDefined) require(nullableListOfNullableStrings.get ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableStrings)
    new NullableListOfNullableStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableStrings = nullableListOfNullableStrings, _calculatedNullableListOfNullableStrings = _calculatedNullableListOfNullableStrings, _persistedNullableListOfNullableStrings = _persistedNullableListOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableStrings_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableStrings = result._nullableListOfNullableStrings
    this._calculatedNullableListOfNullableStrings = result._calculatedNullableListOfNullableStrings
    this._persistedNullableListOfNullableStrings = result._persistedNullableListOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableStrings")
  def nullableListOfNullableStrings = {
    _nullableListOfNullableStrings
  }

  def nullableListOfNullableStrings_= (value: Option[IndexedSeq[Option[String]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableStrings")
  def calculatedNullableListOfNullableStrings = {
    _calculatedNullableListOfNullableStrings
  }

  def calculatedNullableListOfNullableStrings_= (value: Option[IndexedSeq[Option[String]]]) {
    _calculatedNullableListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableStrings")
  def persistedNullableListOfNullableStrings = {
    _persistedNullableListOfNullableStrings
  }

  def persistedNullableListOfNullableStrings_= (value: Option[IndexedSeq[Option[String]]]) {
    _persistedNullableListOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableStrings") nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableStrings") calculatedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableStrings") persistedNullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableStrings = nullableListOfNullableStrings, _calculatedNullableListOfNullableStrings = calculatedNullableListOfNullableStrings, _persistedNullableListOfNullableStrings = persistedNullableListOfNullableStrings)

}

object NullableListOfNullableStrings_3 extends AggregateRootCompanion[NullableListOfNullableStrings_3]{

  def apply(
    nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableStrings)
    require(nullableListOfNullableStrings ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    if (nullableListOfNullableStrings.isDefined) require(nullableListOfNullableStrings.get ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    new NullableListOfNullableStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableStrings = nullableListOfNullableStrings
    , _calculatedNullableListOfNullableStrings = None
    , _persistedNullableListOfNullableStrings = None)
  }

}

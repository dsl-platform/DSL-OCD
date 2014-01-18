package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneStrings: Option[IndexedSeq[String]],
    private var _calculatedNullableListOfOneStrings: Option[IndexedSeq[String]],
    private var _persistedNullableListOfOneStrings: Option[IndexedSeq[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneStrings_3("+ URI +")"

   def copy(nullableListOfOneStrings: Option[IndexedSeq[String]] = this._nullableListOfOneStrings): NullableListOfOneStrings_3 = {

  require(nullableListOfOneStrings ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
  if(nullableListOfOneStrings.isDefined) require(nullableListOfOneStrings.get ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStrings)
    new NullableListOfOneStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneStrings = nullableListOfOneStrings, _calculatedNullableListOfOneStrings = _calculatedNullableListOfOneStrings, _persistedNullableListOfOneStrings = _persistedNullableListOfOneStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStrings_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneStrings = result._nullableListOfOneStrings
    this._calculatedNullableListOfOneStrings = result._calculatedNullableListOfOneStrings
    this._persistedNullableListOfOneStrings = result._persistedNullableListOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStrings")
  def nullableListOfOneStrings = {
    _nullableListOfOneStrings
  }

  def nullableListOfOneStrings_= (value: Option[IndexedSeq[String]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStrings")
  def calculatedNullableListOfOneStrings = {
    _calculatedNullableListOfOneStrings
  }

  def calculatedNullableListOfOneStrings_= (value: Option[IndexedSeq[String]]) {
    _calculatedNullableListOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStrings")
  def persistedNullableListOfOneStrings = {
    _persistedNullableListOfOneStrings
  }

  def persistedNullableListOfOneStrings_= (value: Option[IndexedSeq[String]]) {
    _persistedNullableListOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStrings") nullableListOfOneStrings: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStrings") calculatedNullableListOfOneStrings: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStrings") persistedNullableListOfOneStrings: Option[IndexedSeq[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneStrings = nullableListOfOneStrings, _calculatedNullableListOfOneStrings = calculatedNullableListOfOneStrings, _persistedNullableListOfOneStrings = persistedNullableListOfOneStrings)

}

object NullableListOfOneStrings_3 extends AggregateRootCompanion[NullableListOfOneStrings_3]{

  def apply(
    nullableListOfOneStrings: Option[IndexedSeq[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStrings)
    require(nullableListOfOneStrings ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    if (nullableListOfOneStrings.isDefined) require(nullableListOfOneStrings.get ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    new NullableListOfOneStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneStrings = nullableListOfOneStrings
    , _calculatedNullableListOfOneStrings = None
    , _persistedNullableListOfOneStrings = None)
  }

}

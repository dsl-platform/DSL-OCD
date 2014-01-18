package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneBooleans_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneBooleans: Option[IndexedSeq[Boolean]],
    private var _calculatedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]],
    private var _persistedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneBooleans_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneBooleans_3("+ URI +")"

   def copy(nullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = this._nullableListOfOneBooleans): NullableListOfOneBooleans_3 = {

  require(nullableListOfOneBooleans ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
  if(nullableListOfOneBooleans.isDefined) require(nullableListOfOneBooleans.get ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
    new NullableListOfOneBooleans_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneBooleans = nullableListOfOneBooleans, _calculatedNullableListOfOneBooleans = _calculatedNullableListOfOneBooleans, _persistedNullableListOfOneBooleans = _persistedNullableListOfOneBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneBooleans_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneBooleans = result._nullableListOfOneBooleans
    this._calculatedNullableListOfOneBooleans = result._calculatedNullableListOfOneBooleans
    this._persistedNullableListOfOneBooleans = result._persistedNullableListOfOneBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneBooleans_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBooleans")
  def nullableListOfOneBooleans = {
    _nullableListOfOneBooleans
  }

  def nullableListOfOneBooleans_= (value: Option[IndexedSeq[Boolean]]) {
    _nullableListOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneBooleans")
  def calculatedNullableListOfOneBooleans = {
    _calculatedNullableListOfOneBooleans
  }

  def calculatedNullableListOfOneBooleans_= (value: Option[IndexedSeq[Boolean]]) {
    _calculatedNullableListOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneBooleans")
  def persistedNullableListOfOneBooleans = {
    _persistedNullableListOfOneBooleans
  }

  def persistedNullableListOfOneBooleans_= (value: Option[IndexedSeq[Boolean]]) {
    _persistedNullableListOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBooleans") nullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneBooleans") calculatedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneBooleans") persistedNullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneBooleans = nullableListOfOneBooleans, _calculatedNullableListOfOneBooleans = calculatedNullableListOfOneBooleans, _persistedNullableListOfOneBooleans = persistedNullableListOfOneBooleans)

}

object NullableListOfOneBooleans_3 extends AggregateRootCompanion[NullableListOfOneBooleans_3]{

  def apply(
    nullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = None
  ) = {
    require(nullableListOfOneBooleans ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
    if (nullableListOfOneBooleans.isDefined) require(nullableListOfOneBooleans.get ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
    new NullableListOfOneBooleans_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneBooleans = nullableListOfOneBooleans
    , _calculatedNullableListOfOneBooleans = None
    , _persistedNullableListOfOneBooleans = None)
  }

}

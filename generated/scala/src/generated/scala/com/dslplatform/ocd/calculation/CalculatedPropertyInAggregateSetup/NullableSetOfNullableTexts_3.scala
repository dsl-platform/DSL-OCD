package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableTexts_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableTexts: Option[Set[Option[String]]],
    private var _calculatedNullableSetOfNullableTexts: Option[Set[Option[String]]],
    private var _persistedNullableSetOfNullableTexts: Option[Set[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableTexts_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableTexts_3("+ URI +")"

   def copy(nullableSetOfNullableTexts: Option[Set[Option[String]]] = this._nullableSetOfNullableTexts): NullableSetOfNullableTexts_3 = {

  require(nullableSetOfNullableTexts ne null, "Null value was provided for property \"nullableSetOfNullableTexts\"")
  if(nullableSetOfNullableTexts.isDefined) require(nullableSetOfNullableTexts.get ne null, "Null value was provided for property \"nullableSetOfNullableTexts\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableTexts)
    new NullableSetOfNullableTexts_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableTexts = nullableSetOfNullableTexts, _calculatedNullableSetOfNullableTexts = _calculatedNullableSetOfNullableTexts, _persistedNullableSetOfNullableTexts = _persistedNullableSetOfNullableTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableTexts_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableTexts = result._nullableSetOfNullableTexts
    this._calculatedNullableSetOfNullableTexts = result._calculatedNullableSetOfNullableTexts
    this._persistedNullableSetOfNullableTexts = result._persistedNullableSetOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableTexts_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableTexts")
  def nullableSetOfNullableTexts = {
    _nullableSetOfNullableTexts
  }

  def nullableSetOfNullableTexts_= (value: Option[Set[Option[String]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableTexts")
  def calculatedNullableSetOfNullableTexts = {
    _calculatedNullableSetOfNullableTexts
  }

  def calculatedNullableSetOfNullableTexts_= (value: Option[Set[Option[String]]]) {
    _calculatedNullableSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableTexts")
  def persistedNullableSetOfNullableTexts = {
    _persistedNullableSetOfNullableTexts
  }

  def persistedNullableSetOfNullableTexts_= (value: Option[Set[Option[String]]]) {
    _persistedNullableSetOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableTexts") nullableSetOfNullableTexts: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableTexts") calculatedNullableSetOfNullableTexts: Option[Set[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableTexts") persistedNullableSetOfNullableTexts: Option[Set[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableTexts = nullableSetOfNullableTexts, _calculatedNullableSetOfNullableTexts = calculatedNullableSetOfNullableTexts, _persistedNullableSetOfNullableTexts = persistedNullableSetOfNullableTexts)

}

object NullableSetOfNullableTexts_3 extends AggregateRootCompanion[NullableSetOfNullableTexts_3]{

  def apply(
    nullableSetOfNullableTexts: Option[Set[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableTexts)
    require(nullableSetOfNullableTexts ne null, "Null value was provided for property \"nullableSetOfNullableTexts\"")
    if (nullableSetOfNullableTexts.isDefined) require(nullableSetOfNullableTexts.get ne null, "Null value was provided for property \"nullableSetOfNullableTexts\"")
    new NullableSetOfNullableTexts_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableTexts = nullableSetOfNullableTexts
    , _calculatedNullableSetOfNullableTexts = None
    , _persistedNullableSetOfNullableTexts = None)
  }

}

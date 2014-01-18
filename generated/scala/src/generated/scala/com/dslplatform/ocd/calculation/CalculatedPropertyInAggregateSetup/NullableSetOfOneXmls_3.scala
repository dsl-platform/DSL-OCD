package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneXmls: Option[Set[scala.xml.Elem]],
    private var _calculatedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]],
    private var _persistedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneXmls_3("+ URI +")"

   def copy(nullableSetOfOneXmls: Option[Set[scala.xml.Elem]] = this._nullableSetOfOneXmls): NullableSetOfOneXmls_3 = {

  require(nullableSetOfOneXmls ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
  if(nullableSetOfOneXmls.isDefined) require(nullableSetOfOneXmls.get ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneXmls)
    new NullableSetOfOneXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneXmls = nullableSetOfOneXmls, _calculatedNullableSetOfOneXmls = _calculatedNullableSetOfOneXmls, _persistedNullableSetOfOneXmls = _persistedNullableSetOfOneXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneXmls_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneXmls = result._nullableSetOfOneXmls
    this._calculatedNullableSetOfOneXmls = result._calculatedNullableSetOfOneXmls
    this._persistedNullableSetOfOneXmls = result._persistedNullableSetOfOneXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneXmls")
  def nullableSetOfOneXmls = {
    _nullableSetOfOneXmls
  }

  def nullableSetOfOneXmls_= (value: Option[Set[scala.xml.Elem]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneXmls")
  def calculatedNullableSetOfOneXmls = {
    _calculatedNullableSetOfOneXmls
  }

  def calculatedNullableSetOfOneXmls_= (value: Option[Set[scala.xml.Elem]]) {
    _calculatedNullableSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneXmls")
  def persistedNullableSetOfOneXmls = {
    _persistedNullableSetOfOneXmls
  }

  def persistedNullableSetOfOneXmls_= (value: Option[Set[scala.xml.Elem]]) {
    _persistedNullableSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneXmls") nullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneXmls") calculatedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneXmls") persistedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneXmls = nullableSetOfOneXmls, _calculatedNullableSetOfOneXmls = calculatedNullableSetOfOneXmls, _persistedNullableSetOfOneXmls = persistedNullableSetOfOneXmls)

}

object NullableSetOfOneXmls_3 extends AggregateRootCompanion[NullableSetOfOneXmls_3]{

  def apply(
    nullableSetOfOneXmls: Option[Set[scala.xml.Elem]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneXmls)
    require(nullableSetOfOneXmls ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
    if (nullableSetOfOneXmls.isDefined) require(nullableSetOfOneXmls.get ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
    new NullableSetOfOneXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneXmls = nullableSetOfOneXmls
    , _calculatedNullableSetOfOneXmls = None
    , _persistedNullableSetOfOneXmls = None)
  }

}

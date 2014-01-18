package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]],
    private var _calculatedNullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]],
    private var _persistedNullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableXmls_3("+ URI +")"

   def copy(nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]] = this._nullableArrayOfNullableXmls): NullableArrayOfNullableXmls_3 = {

  require(nullableArrayOfNullableXmls ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
  if(nullableArrayOfNullableXmls.isDefined) require(nullableArrayOfNullableXmls.get ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableXmls)
    new NullableArrayOfNullableXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableXmls = nullableArrayOfNullableXmls, _calculatedNullableArrayOfNullableXmls = _calculatedNullableArrayOfNullableXmls, _persistedNullableArrayOfNullableXmls = _persistedNullableArrayOfNullableXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableXmls_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableXmls = result._nullableArrayOfNullableXmls
    this._calculatedNullableArrayOfNullableXmls = result._calculatedNullableArrayOfNullableXmls
    this._persistedNullableArrayOfNullableXmls = result._persistedNullableArrayOfNullableXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableXmls")
  def nullableArrayOfNullableXmls = {
    _nullableArrayOfNullableXmls
  }

  def nullableArrayOfNullableXmls_= (value: Option[Array[Option[scala.xml.Elem]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableXmls")
  def calculatedNullableArrayOfNullableXmls = {
    _calculatedNullableArrayOfNullableXmls
  }

  def calculatedNullableArrayOfNullableXmls_= (value: Option[Array[Option[scala.xml.Elem]]]) {
    _calculatedNullableArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableXmls")
  def persistedNullableArrayOfNullableXmls = {
    _persistedNullableArrayOfNullableXmls
  }

  def persistedNullableArrayOfNullableXmls_= (value: Option[Array[Option[scala.xml.Elem]]]) {
    _persistedNullableArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableXmls") nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableXmls") calculatedNullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableXmls") persistedNullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableXmls = nullableArrayOfNullableXmls, _calculatedNullableArrayOfNullableXmls = calculatedNullableArrayOfNullableXmls, _persistedNullableArrayOfNullableXmls = persistedNullableArrayOfNullableXmls)

}

object NullableArrayOfNullableXmls_3 extends AggregateRootCompanion[NullableArrayOfNullableXmls_3]{

  def apply(
    nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableXmls)
    require(nullableArrayOfNullableXmls ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
    if (nullableArrayOfNullableXmls.isDefined) require(nullableArrayOfNullableXmls.get ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
    new NullableArrayOfNullableXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableXmls = nullableArrayOfNullableXmls
    , _calculatedNullableArrayOfNullableXmls = None
    , _persistedNullableArrayOfNullableXmls = None)
  }

}

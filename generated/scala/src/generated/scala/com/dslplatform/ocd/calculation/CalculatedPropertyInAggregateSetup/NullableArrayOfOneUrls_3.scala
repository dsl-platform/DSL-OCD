package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneUrls: Option[Array[java.net.URI]],
    private var _calculatedNullableArrayOfOneUrls: Option[Array[java.net.URI]],
    private var _persistedNullableArrayOfOneUrls: Option[Array[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneUrls_3("+ URI +")"

   def copy(nullableArrayOfOneUrls: Option[Array[java.net.URI]] = this._nullableArrayOfOneUrls): NullableArrayOfOneUrls_3 = {

  require(nullableArrayOfOneUrls ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
  if(nullableArrayOfOneUrls.isDefined) require(nullableArrayOfOneUrls.get ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneUrls)
    new NullableArrayOfOneUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneUrls = nullableArrayOfOneUrls, _calculatedNullableArrayOfOneUrls = _calculatedNullableArrayOfOneUrls, _persistedNullableArrayOfOneUrls = _persistedNullableArrayOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneUrls_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneUrls = result._nullableArrayOfOneUrls
    this._calculatedNullableArrayOfOneUrls = result._calculatedNullableArrayOfOneUrls
    this._persistedNullableArrayOfOneUrls = result._persistedNullableArrayOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneUrls")
  def nullableArrayOfOneUrls = {
    _nullableArrayOfOneUrls
  }

  def nullableArrayOfOneUrls_= (value: Option[Array[java.net.URI]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneUrls")
  def calculatedNullableArrayOfOneUrls = {
    _calculatedNullableArrayOfOneUrls
  }

  def calculatedNullableArrayOfOneUrls_= (value: Option[Array[java.net.URI]]) {
    _calculatedNullableArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneUrls")
  def persistedNullableArrayOfOneUrls = {
    _persistedNullableArrayOfOneUrls
  }

  def persistedNullableArrayOfOneUrls_= (value: Option[Array[java.net.URI]]) {
    _persistedNullableArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneUrls") nullableArrayOfOneUrls: Option[Array[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneUrls") calculatedNullableArrayOfOneUrls: Option[Array[java.net.URI]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneUrls") persistedNullableArrayOfOneUrls: Option[Array[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneUrls = nullableArrayOfOneUrls, _calculatedNullableArrayOfOneUrls = calculatedNullableArrayOfOneUrls, _persistedNullableArrayOfOneUrls = persistedNullableArrayOfOneUrls)

}

object NullableArrayOfOneUrls_3 extends AggregateRootCompanion[NullableArrayOfOneUrls_3]{

  def apply(
    nullableArrayOfOneUrls: Option[Array[java.net.URI]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneUrls)
    require(nullableArrayOfOneUrls ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
    if (nullableArrayOfOneUrls.isDefined) require(nullableArrayOfOneUrls.get ne null, "Null value was provided for property \"nullableArrayOfOneUrls\"")
    new NullableArrayOfOneUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneUrls = nullableArrayOfOneUrls
    , _calculatedNullableArrayOfOneUrls = None
    , _persistedNullableArrayOfOneUrls = None)
  }

}
